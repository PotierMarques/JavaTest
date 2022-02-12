package br.com.sigaBemApi.Util;

public class PostalNotFound extends RuntimeException{
    public PostalNotFound(String postal) {
        super("CEP: "+postal+" inválido");
    }
}
