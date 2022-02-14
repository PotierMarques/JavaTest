package br.com.sigaBemApi.Util;

import java.util.ArrayList;

public class ValidacaoErro<List> extends StandardError{
    private static final long SerialVersionUID = 1L;

    private final java.util.List<CampoMensagem> erros = new ArrayList<>();

    public ValidacaoErro(Integer status, String msg, Long timestamp) {
        super(status, msg, timestamp);
    }

    public java.util.List<CampoMensagem> getErrors() {
        return erros;
    }

    public void AddError(String fildname, String message){
        erros.add(new CampoMensagem(fildname, message));
    }


}
