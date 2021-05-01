package br.com.djg.emprestalivroapi.repositorio;

import br.com.djg.emprestalivroapi.dominio.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
