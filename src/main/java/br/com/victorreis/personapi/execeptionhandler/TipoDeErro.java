package br.com.victorreis.personapi.execeptionhandler;

import lombok.Getter;

@Getter
public enum TipoDeErro {

    RECURSO_NAO_ENCONTRADO("/recurso-nao-encontrado", "Recurso não encontrado"),
    ENTIDADE_EM_USO("/entidade-em-uso", "Entidade em uso");


    private String title;
    private String uri;

    TipoDeErro(String path, String title) {
        this.uri = "https://personapi.com.br" + path;
        this.title = title;
    }
}
