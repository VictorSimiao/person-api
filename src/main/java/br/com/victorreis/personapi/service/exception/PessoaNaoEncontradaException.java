package br.com.victorreis.personapi.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class PessoaNaoEncontradaException extends EntidadeNaoEncontradaException {

    public PessoaNaoEncontradaException(Long id) {
        super("Não é possivel encontrar uma pessoa com o id "+id);
    }
}
