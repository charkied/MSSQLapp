package rec.converters.dtoImp;

import org.springframework.stereotype.Component;
import rec.converters.ConverterAdapter;
import rec.model.dto.PrescriptionDto;
import rec.model.entity.PrescriptionEntity;

@Component
public class PrescriptionEntityToDtoConverter extends ConverterAdapter<PrescriptionDto, PrescriptionEntity> {

    @Override
    public PrescriptionDto convert(PrescriptionDto target, PrescriptionEntity source) {
        if(target == null || source == null)
            return null;
        target.setId(source.getId());
        target.setDoctor(source.getDoctor());
        target.setPatient(source.getPatient());
        target.setDrug(source.getDrug());
        target.setExpiration(source.getExpiration());
        target.setRealized(source.getRealized());

        return target;
    }
}
