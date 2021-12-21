package br.com.zup.ZupInvest.Simulacao;

import br.com.zup.ZupInvest.Simulacao.Dto.SimulacaoDto;
import br.com.zup.ZupInvest.Simulacao.Dto.SimulacaoSaidaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/simulacao")
public class SimulacaoController {
    @Autowired
    private SimulacaoService simulacaoService;

    @PutMapping
    public SimulacaoSaidaDto simularInvestimento(@RequestBody @Valid SimulacaoDto simulacaoDTO){
        return simulacaoService.realizarSimulacao(simulacaoDTO);
    }


}
