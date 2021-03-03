package br.com.victorreis.personapi.dto.request;

import br.com.victorreis.personapi.entities.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PessoaRequest {


    @NotBlank
    @Size(min = 2, max = 100)
    private String nome;

    @NotBlank
    @Size(min = 2, max = 100)
    private String sobrenome;

    @NotBlank
    @CPF
    private String cpf;

    @NotBlank
    private LocalDate dataDeNascimento;

//    @Valid
//    @NotBlank
//    private List<TelefoneRequest> telefones ;

    public Pessoa toModel(){
        return new Pessoa(nome,sobrenome,cpf);
    }
}
