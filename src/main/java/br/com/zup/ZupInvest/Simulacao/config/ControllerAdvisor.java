package br.com.zup.ZupInvest.Simulacao.config;

import br.com.zup.ZupInvest.Simulacao.Exceptions.ValorBaixoParaRiscoAltoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ControllerAdvisor {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public List<ErroValidacao> manipularErrosDeValidacao(MethodArgumentNotValidException exception){
        List<ErroValidacao> erros = new ArrayList<>();

        for (FieldError fieldError : exception.getFieldErrors()){
            ErroValidacao erroDeValidacao = new ErroValidacao(fieldError.getField(),
                    fieldError.getDefaultMessage());
            erros.add(erroDeValidacao);
        }

        return erros;
    }

    @ExceptionHandler(ValorBaixoParaRiscoAltoException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public MensagemErro manipularExcecaoDeRiscoAltoEValorBaixo(ValorBaixoParaRiscoAltoException exception){
        return new MensagemErro(exception.getMessage());
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public MensagemErro manupularExcecaoDeEnumInvalido(HttpMessageNotReadableException exception){
        if(exception.getLocalizedMessage().contains("br.com.zup.ZupSimula.Simulacao.enuns.Risco")){
            return new MensagemErro("Risco não reconhecido");
        }
        return new MensagemErro(exception.getLocalizedMessage());
    }


}
