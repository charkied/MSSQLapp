package rec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rec.model.entity.DrugEntity;

import java.util.List;
import java.util.Optional;


public interface DrugRepository extends JpaRepository<DrugEntity, Long> {

    Optional<DrugEntity> findByName(String name);

    List<DrugEntity> findAllByProducer(String producer);

}
