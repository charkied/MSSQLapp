package rec.model.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import rec.model.entity.UserStatusEntity;

@Getter
@Setter
@EqualsAndHashCode
public class UserDto {
    private Long id;

    private String firstname;
    private String lastname;

    private String pesel;
    private String sex;

    private String contactNumber;
    private String email;

    private UserStatusEntity userStatus;

}
