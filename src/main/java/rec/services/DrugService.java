package rec.services;

import rec.model.dto.DrugDto;
import rec.model.form.NewDrugForm;

import java.util.List;

public interface DrugService {

    DrugDto findById(Long id);

    DrugDto findByName(String name);

    List<DrugDto> findAllByProducer(String producer);

    DrugDto saveNew(NewDrugForm drugForm);

    DrugDto save(DrugDto drugDto);

    boolean deleteById(Long id);

}
