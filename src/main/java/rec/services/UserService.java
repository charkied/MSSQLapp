package rec.services;

import rec.model.dto.UserDto;
import rec.model.form.NewUserForm;

import java.util.List;

public interface UserService {

    UserDto findById(Long id);

    UserDto findByPesel(String pesel);

    List<UserDto> findAllByFirstnameAndLastname(String firstname, String lastname);

    UserDto saveNew(NewUserForm userForm);

    UserDto save(UserDto userDto);

    boolean deleteById(Long id);



}
