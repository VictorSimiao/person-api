package br.com.victorreis.personapi.dto.request;

import br.com.victorreis.personapi.enums.TipoTelefone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TelefoneRequest {

    private Long id;

    @Enumerated(EnumType.STRING)
    private TipoTelefone tipo;

    @NotBlank
    @Size(min = 13, max = 14)
    private String number;
}

