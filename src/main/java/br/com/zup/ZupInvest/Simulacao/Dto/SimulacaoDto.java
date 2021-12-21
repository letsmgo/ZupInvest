package br.com.zup.ZupInvest.Simulacao.Dto;

import br.com.zup.ZupInvest.Simulacao.Enum.Risco;

import javax.validation.constraints.Email;

public class SimulacaoDto {
    @Email(message = "E-mail inválido")
    private String email;
    private String nome;
    private String cpf;
    private double valorInvestimento;
    private int periodoDeAplicacaoMeses;
    private Risco risco;

    public SimulacaoDto() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValorInvestimento() {
        return valorInvestimento;
    }

    public void setValorInvestimento(double valorInvestimento) {
        this.valorInvestimento = valorInvestimento;
    }

    public int getPeriodoDeAplicacaoMeses() {
        return periodoDeAplicacaoMeses;
    }

    public void setPeriodoDeAplicacaoMeses(int periodoDeAplicacaoMeses) {
        this.periodoDeAplicacaoMeses = periodoDeAplicacaoMeses;
    }

    public Risco getRisco() {
        return risco;
    }

    public void setRisco(Risco risco) {
        this.risco = risco;
    }

}
