package blog.particular.com.blog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import blog.particular.com.blog.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario);

}
