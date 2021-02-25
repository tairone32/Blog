package blog.particular.com.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import blog.particular.com.blog.model.Tema;


public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);

}
