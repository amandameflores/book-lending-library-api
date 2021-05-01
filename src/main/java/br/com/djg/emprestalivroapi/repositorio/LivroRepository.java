package br.com.djg.emprestalivroapi.repositorio;

import br.com.djg.emprestalivroapi.dominio.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
