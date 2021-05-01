package br.com.djg.emprestalivroapi.servico;

import br.com.djg.emprestalivroapi.dominio.Livro;
import br.com.djg.emprestalivroapi.repositorio.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {


    @Autowired
    private LivroRepository livroRepository;

    public void salvarLivro(Livro livro) {
        livroRepository.save(livro);
    }
}
