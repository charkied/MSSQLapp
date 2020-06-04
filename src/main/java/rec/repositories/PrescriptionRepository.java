package rec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rec.model.entity.PrescriptionEntity;
import rec.model.entity.UserEntity;

import java.util.List;


public interface PrescriptionRepository extends JpaRepository<PrescriptionEntity, Long> {

    List<PrescriptionEntity> findAllByPatient(UserEntity patient);

    List<PrescriptionEntity> findAllByPatientAndRealized(UserEntity patient, boolean realized);

    List<PrescriptionEntity> findAllByDoctor(UserEntity doctor);



}
