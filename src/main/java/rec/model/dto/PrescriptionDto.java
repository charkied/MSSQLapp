package rec.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import rec.model.entity.DrugEntity;
import rec.model.entity.UserEntity;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
public class PrescriptionDto {
    private Long id;

    private UserEntity doctor;
    private UserEntity patient;

    private DrugEntity drug;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate expiration;

    private Boolean realized;
}
