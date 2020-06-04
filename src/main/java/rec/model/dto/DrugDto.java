package rec.model.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class DrugDto {
    private Long id;

    private String name;
    private String producer;
}
