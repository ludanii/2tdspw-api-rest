package br.com.fiap.api_rest.dto;

public class BibliotecaResponse {

    private Long id;
    private String infoBiblioteca;

    public BibliotecaResponse(Long id, String infoBiblioteca) {
        this.id = id;
        this.infoBiblioteca = infoBiblioteca;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInfoBiblioteca() {
        return infoBiblioteca;
    }

    public void setInfoBiblioteca(String infoBiblioteca) {
        this.infoBiblioteca = infoBiblioteca;
    }
}
