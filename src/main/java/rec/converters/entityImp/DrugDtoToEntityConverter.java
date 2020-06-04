package rec.converters.entityImp;

import org.springframework.stereotype.Component;
import rec.converters.ConverterAdapter;
import rec.model.dto.DrugDto;
import rec.model.entity.DrugEntity;

@Component
public class DrugDtoToEntityConverter extends ConverterAdapter<DrugEntity, DrugDto> {
    @Override
    public DrugEntity convert(DrugEntity target, DrugDto source) {
        if(target == null || source == null)
            return null;
        target.setId(source.getId());
        target.setName(source.getName());
        target.setProducer(source.getProducer());

        return target;
    }
}
