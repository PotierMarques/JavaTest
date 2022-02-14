package br.com.sigaBemApi.entity.DAO;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_analise")
public class Analise {

//    ATTRIBUTES

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nomeDestinatario;

    private String cepOrigem;

    private String cepDestino;

    private Double peso;

    private Double vlTotalFrete;

    private LocalDate dataPrevistaEntrega;

    private LocalDate dataConsulta;

//CONSTRUCTORS

    public Analise() {}

    public Analise(Long id, String nomeDestinatario, String cepOrigem,
                   String cepDestino, Double peso, Double vlTotalFrete,
                   LocalDate dataPrevistaEntrega, LocalDate dataConsulta) {
        Id = id;
        this.nomeDestinatario = nomeDestinatario;
        this.cepOrigem = cepOrigem;
        this.cepDestino = cepDestino;
        this.peso = peso;
        this.vlTotalFrete = vlTotalFrete;
        this.dataPrevistaEntrega = dataPrevistaEntrega;
        this.dataConsulta = dataConsulta;
    }

    //GETTER'S AND SETTER'S

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


//METODOS

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Analise that = (Analise) o;
        return Id == that.Id;
    }
    @Override
    public int hashCode() {return Objects.hash(Id);}

    @Override
    public String toString() {
        return "ConsultaRealizada{" +
                "nomeDestinatario='" + nomeDestinatario + '\'' +
                ", vlTotalFrete=" + vlTotalFrete +
                ", dataPrevistaEntrega=" + dataPrevistaEntrega +
                '}';
    }
}
