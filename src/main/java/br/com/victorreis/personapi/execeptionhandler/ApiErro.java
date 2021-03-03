package br.com.victorreis.personapi.execeptionhandler;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class ApiErro {

    private Integer status;
    private LocalDateTime timestamp;
    private String type;
    private String title;
    private String detail;
}
