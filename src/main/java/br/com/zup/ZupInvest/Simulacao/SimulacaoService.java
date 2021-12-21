package br.com.zup.ZupInvest.Simulacao;

import br.com.zup.ZupInvest.Simulacao.Dto.SimulacaoDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SimulacaoService {
    private List<SimulacaoDto> simulacao = new ArrayList<>();

    public void criarSimulacao(SimulacaoDto simulacaoDto){
        simulacao.add(simulacaoDto);
    }


}
