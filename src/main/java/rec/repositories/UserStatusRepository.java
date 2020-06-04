package rec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rec.model.entity.UserStatusEntity;

import java.util.List;


public interface UserStatusRepository extends JpaRepository<UserStatusEntity, Long> {

    List<UserStatusEntity> findAll();
}
