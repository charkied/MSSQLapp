package rec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rec.model.entity.UserEntity;
import rec.model.entity.UserStatusEntity;

import java.util.List;


public interface UserRepository extends JpaRepository<UserEntity, Long> {

    List<UserEntity> findAllByUserStatus(UserStatusEntity userStatus);

    UserEntity findByPesel(String pesel);

    List<UserEntity> findAllByFirstnameAndLastname(String firstname, String lastname);
}
