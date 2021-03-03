package br.com.victorreis.personapi.dto.response;


import br.com.victorreis.personapi.entities.Pessoa;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class PessoaDTO {
    private String nome;

    private String sobrenome;

    private String cpf;

    private LocalDate dataDeNascimento;

    public PessoaDTO(Pessoa pessoa){
        this.nome= pessoa.getNome();
        this.sobrenome = pessoa.getSobrenome();
        this.cpf = pessoa.getCpf();
    }

    public static List<PessoaDTO> converter(List<Pessoa> pessoas){
        return pessoas.stream().map(PessoaDTO::new).collect(Collectors.toList());
    }
}
