package rec.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstname;
    private String lastname;

    private String pesel;
    private String sex;

    private String contactNumber;
    private String email;

    @ManyToOne
    private UserStatusEntity userStatus;
}
