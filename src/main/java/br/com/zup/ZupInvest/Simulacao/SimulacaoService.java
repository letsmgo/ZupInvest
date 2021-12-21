package br.com.zup.ZupInvest.Simulacao;

import br.com.zup.ZupInvest.Simulacao.Dto.SimulacaoDto;
import br.com.zup.ZupInvest.Simulacao.Dto.SimulacaoSaidaDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SimulacaoService {
    private List<SimulacaoDto> simulacao = new ArrayList<>();

    public void criarSimulacao(SimulacaoDto simulacaoDto){
        simulacao.add(simulacaoDto);
    }

    public SimulacaoSaidaDto calculoDaSimulacao(SimulacaoDto simulacaoDto){
        double taxaDeRendimento  = simulacaoDto.getRisco().getTaxaDeRendimento();
        double valorAplicado = simulacaoDto.getValorInvestimento();
        int periodoDaAplicacao = simulacaoDto.getPeriodoDeAplicacaoMeses();

        double valorDoLucro = 0;
        double valorTotal = valorAplicado;

        for(int i = 0; i < periodoDaAplicacao; i++){
            valorDoLucro = valorDoLucro + (valorTotal * taxaDeRendimento);
            valorTotal = valorAplicado + valorDoLucro;
        }

        return new SimulacaoSaidaDto(valorAplicado, valorDoLucro, valorTotal);
    }

    public SimulacaoSaidaDto realizarSimulacao(SimulacaoDto simulacaoDto){
        criarSimulacao(simulacaoDto);
        return calculoDaSimulacao(simulacaoDto);
    }


}
