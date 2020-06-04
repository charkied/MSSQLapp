package rec.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class PrescriptionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private UserEntity doctor;
    @ManyToOne
    private UserEntity patient;

    @ManyToOne
    private DrugEntity drug;
    private LocalDate expiration;


    private Boolean realized;

}
