package py.edu.uca.afeltes.converter;

import org.springframework.beans.BeanUtils;

import py.edu.uca.afeltes.domain.UserEntity;
import py.edu.uca.afeltes.web.dto.UserProfileDTO;

/**
 * Clase utilizada para realizar la conversión de una entidad de usuario a un
 * DTO del perfil del usuario.
 * <p/>
 * Ver: {@link py.edu.uca.afeltes.domain.UserEntity} Ver:
 * {@link py.edu.uca.afeltes.web.dto.UserProfileDTO}
 * <p/>
 * Created by sodep on 26/03/14.
 */
public final class UserConverter {

	public static UserProfileDTO buildUserProfileDTO(UserEntity userEntity) {

		UserProfileDTO dto = new UserProfileDTO();

		if (userEntity != null) {
			dto.setUserFullname(userEntity.getFullname());
			dto.setUserId(userEntity.getId());
			BeanUtils.copyProperties(userEntity, dto);
		}
		return dto;
	}

	public static UserProfileDTO buildFullUserProfileDTO(UserEntity userEntity) {
		UserProfileDTO dto = buildUserProfileDTO(userEntity);

		return dto;
	}

	private UserConverter() {
	}
}
