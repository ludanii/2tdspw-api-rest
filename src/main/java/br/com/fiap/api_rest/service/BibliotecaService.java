package br.com.fiap.api_rest.service;

import br.com.fiap.api_rest.dto.*;
import br.com.fiap.api_rest.model.Biblioteca;
import br.com.fiap.api_rest.model.Livro;
import br.com.fiap.api_rest.repository.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.ArrayList;
import java.util.List;


public class BibliotecaService {
    @Autowired
    BibliotecaRepository bibliotecaRepository;

    public Biblioteca requestToBiblioteca(BibliotecaRequest bibliotecaRequest) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setNome(bibliotecaRequest.getNome());
        biblioteca.setEndereco(bibliotecaRequest.getEndereco());
        biblioteca.setLivros(bibliotecaRequest.getLivros());
        return biblioteca;
    }

    public BibliotecaResponse BibliotecaToResponse(Biblioteca biblioteca) {
        return new BibliotecaResponse(biblioteca.getId(), biblioteca.getNome() + " - " + biblioteca.getEndereco());
    }


    public List<BibliotecaResponse> BibliotecaToResponse(List<Biblioteca> bibliotecas) {
        List<BibliotecaResponse> listaBiblioteca = new ArrayList<>();
        for (Biblioteca biblioteca : bibliotecas) {
            listaBiblioteca.add(BibliotecaResponse(biblioteca));
        }
        return listaBiblioteca;
    }
}
