package rec.converters.entityImp;

import org.springframework.stereotype.Component;
import rec.converters.ConverterAdapter;
import rec.model.dto.PrescriptionDto;
import rec.model.entity.PrescriptionEntity;

@Component
public class PrescriptionDtoToEntityConverter extends ConverterAdapter<PrescriptionEntity, PrescriptionDto> {
    @Override
    public PrescriptionEntity convert(PrescriptionEntity target, PrescriptionDto source) {
        if(target == null || source == null)
            return null;
        target.setDoctor(source.getDoctor());
        target.setDrug(source.getDrug());
        target.setExpiration(source.getExpiration());
        target.setId(source.getId());
        target.setPatient(source.getPatient());
        target.setRealized(source.getRealized());

        return target;
    }
}
