package br.com.sigaBemApi.Util;

public class CampoMensagem {
    private static final long SerialVersionUID = 1l;

    private String fildname;
    private String message;

    public CampoMensagem(String fildname, String message) {
        this.fildname = fildname;
        this.message = message;
    }

    public String getFildname() {
        return fildname;
    }

    public void setFildname(String fildname) {
        this.fildname = fildname;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
