package br.com.victorreis.personapi.repository;

import br.com.victorreis.personapi.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
