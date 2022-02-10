package br.com.sigaBemApi.Util;

@SuppressWarnings("serial")
public class PostalNotFound extends RuntimeException{
    public PostalNotFound(String postal) {
        super("CEP: "+postal+" inválido");

    }
}
