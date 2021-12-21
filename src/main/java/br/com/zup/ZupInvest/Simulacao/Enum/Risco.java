package br.com.zup.ZupInvest.Simulacao.Enum;

public enum Risco {

    ALTO(0.025), MEDIO(0.015), BAIXO(0.005);

    private double taxaDeRendimento;

    Risco(double valor){
        taxaDeRendimento = valor;
    }

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

}
