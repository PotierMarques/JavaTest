package br.com.sigaBemApi.entity;

import br.com.sigaBemApi.service.BuscarPostal;


public class Postal extends BuscarPostal {
    private String cep;
    private String uf;
    private String ddd;

    public Postal() {

    }

    public Postal(String cep, String uf, String ddd) {

        this.cep = cep;
        this.uf = uf;
        this.ddd = ddd;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
}
