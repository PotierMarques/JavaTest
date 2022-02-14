package br.com.sigaBemApi.DTO.Response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import javax.validation.Valid;
import java.time.LocalDate;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AnaliseResponse {
    /*
                       ATTRIBUTES
    */
    private Long id;
    private String cepOrigem;
    private String cepDestino;
    private LocalDate dataPrevistaEntrega;
    private Double vlTotalFrete;
    private Long peso;
    private String nomeDestinatario;
    /*
                        CONSTRUCTORS
     */
    public AnaliseResponse(String id, Long peso, String cepOrigem, String cepDestino,
                           LocalDate dataPrevistaEntrega, Double vlTotalFrete) {
        this.id = Long.valueOf(id);
        this.cepOrigem = cepOrigem;
        this.cepDestino = cepDestino;
        this.dataPrevistaEntrega = dataPrevistaEntrega;
        this.vlTotalFrete = vlTotalFrete;
        this.peso = peso;
        this.nomeDestinatario = nomeDestinatario;
    }
    //EDITAR
    public AnaliseResponse() {

    }
    /*
                        GETTER'S AND SETTER'S
     */
    public String getCepOrigem() {
        return cepOrigem;
    }
    public void setCepOrigem(String cepOrigem) {
        this.cepOrigem = cepOrigem;
    }
    public String getCepDestino() {
        return cepDestino;
    }
    public void setCepDestino(String cepDestino) {
        this.cepDestino = cepDestino;
    }
    public LocalDate getDataPrevistaEntrega() {
        return dataPrevistaEntrega;
    }
    public void setDataPrevistaEntrega(LocalDate dataPrevistaEntrega) {
        this.dataPrevistaEntrega = dataPrevistaEntrega;}
    public Double getVlTotalFrete() {
        return vlTotalFrete;
    }
    public Double setVlTotalFrete(Double vlTotalFrete) {return vlTotalFrete;}
    public Long getId() {
        return id;
    }
    public void setId(@Valid Long id) {
        this.id = id;
    }
    public Long getPeso() {
        return peso;
    }
    public void setPeso(Long peso) {
        this.peso = peso;
    }
    public String getNomeDestinatario() {
        return nomeDestinatario;
    }
    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }
}

