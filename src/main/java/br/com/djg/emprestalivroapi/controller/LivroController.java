package br.com.djg.emprestalivroapi.controller;

import br.com.djg.emprestalivroapi.dominio.Livro;
import br.com.djg.emprestalivroapi.servico.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping("/livro")
    public void salvarLivro(@RequestBody Livro livro){
        livroService.salvarLivro(livro);

    }
}


