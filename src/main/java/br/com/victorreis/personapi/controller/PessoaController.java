package br.com.victorreis.personapi.controller;

import br.com.victorreis.personapi.dto.response.PessoaDTO;
import br.com.victorreis.personapi.entities.Pessoa;
import br.com.victorreis.personapi.service.exception.PessoaNaoEncontradaException;
import br.com.victorreis.personapi.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pessoas")
public class PessoaController {

    private PessoaService pessoaService;

      @Autowired
      public PessoaController(PessoaService pessoaService){
         this.pessoaService = pessoaService;
     }

     @GetMapping("/{id}")
    public ResponseEntity<PessoaDTO> getPessoa(@PathVariable Long id) throws PessoaNaoEncontradaException {
         Pessoa pessoa = pessoaService.findById(id);
         return ResponseEntity.ok(new PessoaDTO(pessoa));
     }

}
