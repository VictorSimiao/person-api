package br.com.victorreis.personapi.service;


import br.com.victorreis.personapi.entities.Pessoa;
import br.com.victorreis.personapi.service.exception.PessoaNaoEncontradaException;
import br.com.victorreis.personapi.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    private PessoaRepository pessoaRepository;


    @Autowired
    public PessoaService(PessoaRepository pessoaRepository){

        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa findById(Long id) {
        return pessoaRepository.findById(id).orElseThrow(()-> new PessoaNaoEncontradaException(id));
    }



}
