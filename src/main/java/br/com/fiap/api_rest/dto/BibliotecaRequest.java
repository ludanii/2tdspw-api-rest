package br.com.fiap.api_rest.dto;

import br.com.fiap.api_rest.model.Endereco;
import br.com.fiap.api_rest.model.Livro;


import java.util.List;

public class BibliotecaRequest {

    private String nome;
    private Endereco endereco;
    private List<Livro> livros;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
}
