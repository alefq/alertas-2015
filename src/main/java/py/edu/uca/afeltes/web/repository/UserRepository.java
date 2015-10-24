package py.edu.uca.afeltes.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import py.edu.uca.afeltes.domain.UserEntity;

import java.util.List;

/**
 * Repositorio para la entidad {@link py.edu.uca.afeltes.domain.UserEntity}
 * <p/>
 * Created by sodep on 17/01/14.
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findOneByMail(String email);

    UserEntity findOneByMailAndPassword(String email, String password);

    List<UserEntity> findAllByMail(String email);
}

