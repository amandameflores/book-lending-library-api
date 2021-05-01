package br.com.djg.emprestalivroapi.repositorio;

import br.com.djg.emprestalivroapi.dominio.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
}