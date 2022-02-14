package br.com.sigaBemApi.Util;

public class PostalNotFound extends RuntimeException{

    public PostalNotFound(String Cep) {
         super("CEP: "+Cep+" inválido");
    }

}
