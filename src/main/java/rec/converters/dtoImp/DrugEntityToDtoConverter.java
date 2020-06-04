package rec.converters.dtoImp;

import org.springframework.stereotype.Component;
import rec.converters.ConverterAdapter;
import rec.model.dto.DrugDto;
import rec.model.entity.DrugEntity;

@Component
public class DrugEntityToDtoConverter extends ConverterAdapter<DrugDto, DrugEntity> {

    @Override
    public DrugDto convert(DrugDto target, DrugEntity source){
        if(target == null || source == null)
            return null;
        target.setId(source.getId());
        target.setName(source.getName());
        target.setProducer(source.getProducer());

        return target;
    }
}
