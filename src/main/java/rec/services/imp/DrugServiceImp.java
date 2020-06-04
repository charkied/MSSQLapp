package rec.services.imp;

import org.springframework.stereotype.Service;
import rec.converters.Converter;
import rec.model.dto.DrugDto;
import rec.model.entity.DrugEntity;
import rec.model.form.NewDrugForm;
import rec.repositories.DrugRepository;
import rec.services.DrugService;

import java.util.List;

@Service
public class DrugServiceImp implements DrugService {

    private final DrugRepository drugRepository;

    private final Converter<DrugEntity, DrugDto> drugDtoToEntityConverter;
    private final Converter<DrugDto, DrugEntity> drugEntityToDtoConverter;

    public DrugServiceImp(DrugRepository drugRepository, Converter<DrugEntity, DrugDto> drugDtoToEntityConverter, Converter<DrugDto, DrugEntity> drugEntityToDtoConverter){
        this.drugRepository = drugRepository;
        this.drugDtoToEntityConverter = drugDtoToEntityConverter;
        this.drugEntityToDtoConverter = drugEntityToDtoConverter;
    }

    @Override
    public DrugDto findById(Long id) {
        return drugEntityToDtoConverter.convert(
                drugRepository.findById(id).orElse(null)
        );
    }

    @Override
    public DrugDto findByName(String name) {
        return drugEntityToDtoConverter.convert(
                drugRepository.findByName(name).orElse(null)
        );
    }

    @Override
    public List<DrugDto> findAllByProducer(String producer) {
        return drugEntityToDtoConverter.convertToList(
                drugRepository.findAllByProducer(producer)
        );
    }
    //TODO
    @Override
    public DrugDto saveNew(NewDrugForm drugForm) {
        //implement validator validate form and convert form to entity and save
        return null;
    }
    //TODO
    @Override
    public DrugDto save(DrugDto drugDto) {
        //validate dto convert and save
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        if (!drugRepository.existsById(id))
            return false;

        drugRepository.deleteById(id);
        return true;
    }
}
