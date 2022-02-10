package br.com.sigaBemApi.DTO.Request;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
public class Carga {
    @javax.persistence.Id
    private Long Id;

    @NotEmpty(message = "Campo com preenchimento obrigatório!")
    @Size(max = 55, message = "Nome deve conter menos de 55 caracteres!")
    private String nomeDestinatario;

    @NotEmpty(message = "Campo com preenchimento obrigatório!")
    @Size(min = 8, max = 8, message = "CEP deve conter 8 digitos!")
    private String cepOrigem;

    @NotEmpty(message = "Campo com preenchimento obrigatório!")
    @Size(min = 8, max = 8, message = "CEP deve conter 8 digitos!")
    private String cepDestino;

    @NotEmpty(message = "Campo com preenchimento obrigatório!")
    @Size(min = 0, message = "Peso deve ser maior que zero!")
    public Double peso;

    public Double vlTotalFrete;

    public LocalDate dataPrevistaEntrega;

    public LocalDate dataConsulta;


    public Carga() {

    }
    //
    public Carga(String cepOrigem, String cepDestino, LocalDate dataPrevistaEntrega, Double vlTotalFrete) {
        this.cepOrigem = cepOrigem;
        this.cepDestino = cepDestino;
        this.dataPrevistaEntrega = dataPrevistaEntrega;
        this.vlTotalFrete = vlTotalFrete;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

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

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getVlTotalFrete() {
        return vlTotalFrete;
    }

    public void setVlTotalFrete(Double vlTotalFrete) {
        this.vlTotalFrete = vlTotalFrete;
    }

    public LocalDate getDataPrevistaEntrega() {
        return dataPrevistaEntrega;
    }

    public void setDataPrevistaEntrega(LocalDate dataPrevistaEntrega) {
        this.dataPrevistaEntrega = dataPrevistaEntrega;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }
}
