package br.com.zup.ZupInvest.Simulacao.config;

public class MensagemErro {
    private String mensagemDeErro;

    public MensagemErro(String mensagemDeErro) {
        this.mensagemDeErro = mensagemDeErro;
    }

    public String getMensagemDeErro() {
        return mensagemDeErro;
    }

    public void setMensagemDeErro(String mensagemDeErro) {
        this.mensagemDeErro = mensagemDeErro;
    }
}
