package br.com.victorreis.personapi.execeptionhandler;

import br.com.victorreis.personapi.service.exception.EntidadeNaoEncontradaException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(EntidadeNaoEncontradaException.class)
    public ResponseEntity<?> handleEntidadeNaoEncontrada(EntidadeNaoEncontradaException ex,
                                                         WebRequest request) {

        HttpStatus status = HttpStatus.NOT_FOUND;
        TipoDeErro tipoDeErro = TipoDeErro.RECURSO_NAO_ENCONTRADO;
        String detail = ex.getMessage();

        ApiErro apiErro = createProblemBuilder(status, tipoDeErro, detail)
                .build();

        return handleExceptionInternal(ex, apiErro, new HttpHeaders(), status, request);
    }

    private ApiErro.ApiErroBuilder createProblemBuilder(HttpStatus status,
                                                        TipoDeErro tipoDeErro, String detail) {

        return ApiErro.builder()
                .timestamp(LocalDateTime.now())
                .status(status.value())
                .type(tipoDeErro.getUri())
                .title(tipoDeErro.getTitle())
                .detail(detail);
    }
}
