package rec.services;

import rec.model.dto.PrescriptionDto;
import rec.model.dto.UserDto;
import rec.model.form.NewPrescriptionForm;

import java.util.List;

public interface PrescriptionService {

    PrescriptionDto findById(Long id);

    List<PrescriptionDto> findAllByDoctor(UserDto doctor);

    List<PrescriptionDto> findAllByPatient(UserDto patient);

    List<PrescriptionDto> findAllByPatientAndRealized(UserDto patient, boolean realized);

    PrescriptionDto saveNew(NewPrescriptionForm prescriptionForm);

    PrescriptionDto save(PrescriptionDto prescriptionDto);

    boolean deleteById(Long id);
}
