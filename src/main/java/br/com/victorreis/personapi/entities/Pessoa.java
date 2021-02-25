package br.com.victorreis.personapi.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

   @Column(nullable = false)
    private String nome;

   @Column(nullable = false)
    private String sobrenome;

   @Column(nullable = false,unique = true)
    private String cpf;

    private LocalDate dataDeNascimento;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Telefone> telefones = new ArrayList<>();

}
