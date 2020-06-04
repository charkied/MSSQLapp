package rec.services.imp;

import org.springframework.stereotype.Service;
import rec.converters.Converter;
import rec.model.dto.PrescriptionDto;
import rec.model.dto.UserDto;
import rec.model.entity.PrescriptionEntity;
import rec.model.entity.UserEntity;
import rec.model.form.NewPrescriptionForm;
import rec.repositories.PrescriptionRepository;
import rec.services.PrescriptionService;

import java.util.List;

@Service
public class PrescriptionServiceImp implements PrescriptionService {

    private final PrescriptionRepository prescriptionRepository;

    private final Converter<PrescriptionDto, PrescriptionEntity> prescriptionEntityToDtoConverter;
    private final Converter<PrescriptionEntity, PrescriptionDto> prescriptionDtoToEntityConverter;
    private final Converter<UserEntity, UserDto> userDtoToEntityConverter;

    public PrescriptionServiceImp(PrescriptionRepository prescriptionRepository, Converter<PrescriptionDto, PrescriptionEntity> prescriptionEntityToDtoConverter, Converter<PrescriptionEntity, PrescriptionDto> prescriptionDtoToEntityConverter, Converter<UserEntity, UserDto> userDtoToEntityConverter){
        this.prescriptionDtoToEntityConverter = prescriptionDtoToEntityConverter;
        this.prescriptionEntityToDtoConverter = prescriptionEntityToDtoConverter;
        this.prescriptionRepository = prescriptionRepository;
        this.userDtoToEntityConverter = userDtoToEntityConverter;
    }


    @Override
    public PrescriptionDto findById(Long id) {
        return prescriptionEntityToDtoConverter.convert(
                prescriptionRepository.findById(id).orElse(null)
        );
    }

    @Override
    public List<PrescriptionDto> findAllByDoctor(UserDto doctor) {
        UserEntity doctorEntity = userDtoToEntityConverter.convert(doctor);
        return prescriptionEntityToDtoConverter.convertToList(
                prescriptionRepository.findAllByDoctor(doctorEntity)
        );
    }

    @Override
    public List<PrescriptionDto> findAllByPatient(UserDto patient) {
        UserEntity patientEntity = userDtoToEntityConverter.convert(patient);
        return prescriptionEntityToDtoConverter.convertToList(
                prescriptionRepository.findAllByPatient(patientEntity)
        );
    }

    @Override
    public List<PrescriptionDto> findAllByPatientAndRealized(UserDto patient, boolean realized) {
        UserEntity patientEntity = userDtoToEntityConverter.convert(patient);
        return prescriptionEntityToDtoConverter.convertToList(
                prescriptionRepository.findAllByPatientAndRealized(patientEntity, realized)
        );
    }
    //TODO
    @Override
    public PrescriptionDto saveNew(NewPrescriptionForm prescriptionForm) {
        //validator
        return null;
    }
    //TODO
    @Override
    public PrescriptionDto save(PrescriptionDto prescriptionDto) {
        //validator
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        if (!prescriptionRepository.existsById(id))
            return false;

        prescriptionRepository.deleteById(id);
        return true;
    }
}
