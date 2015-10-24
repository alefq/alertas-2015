package py.edu.uca.afeltes.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import py.edu.uca.afeltes.domain.ParameterEntity;

import java.util.List;

/**
 * <p>Repositorio JPA de Spring Data para la entidad ParameterEntity, que
 * representa un parámetro</p>
 *
 */
public interface ParameterRepository extends JpaRepository<ParameterEntity, Long>{
	
	public List<ParameterEntity> findAll();
    
	ParameterEntity findByLabel(String name);
}
