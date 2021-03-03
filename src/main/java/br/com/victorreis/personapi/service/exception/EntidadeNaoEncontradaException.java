package br.com.victorreis.personapi.service.exception;

public class EntidadeNaoEncontradaException extends RuntimeException {

    public EntidadeNaoEncontradaException(String mensagem){
        super(mensagem);
    }
}
