package rec.services.imp;

import org.springframework.stereotype.Service;
import rec.converters.Converter;
import rec.model.dto.UserDto;
import rec.model.entity.UserEntity;
import rec.model.form.NewUserForm;
import rec.repositories.UserRepository;
import rec.services.UserService;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    private final Converter<UserDto, UserEntity> userEntityToDtoConverter;
    private final Converter<UserEntity, UserDto> userDtoToEntityConverter;

    public UserServiceImp(UserRepository userRepository, Converter<UserDto, UserEntity> userEntityToDtoConverter, Converter<UserEntity, UserDto> userDtoToEntityConverter){
        this.userRepository = userRepository;
        this.userDtoToEntityConverter = userDtoToEntityConverter;
        this.userEntityToDtoConverter = userEntityToDtoConverter;
    }

    @Override
    public UserDto findById(Long id) {
        return userEntityToDtoConverter.convert(
                userRepository.findById(id).orElse(null)
        );
    }

    @Override
    public UserDto findByPesel(String pesel) {
        return userEntityToDtoConverter.convert(
                userRepository.findByPesel(pesel)
        );
    }

    @Override
    public List<UserDto> findAllByFirstnameAndLastname(String firstname, String lastname) {
        return userEntityToDtoConverter.convertToList(
                userRepository.findAllByFirstnameAndLastname(firstname, lastname)
        );
    }
    //TODO
    @Override
    public UserDto saveNew(NewUserForm userForm) {
        //validator
        return null;
    }
    //TODO
    @Override
    public UserDto save(UserDto userDto) {
        //validator
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        if (!userRepository.existsById(id))
            return false;

        userRepository.deleteById(id);
        return true;
    }

}
