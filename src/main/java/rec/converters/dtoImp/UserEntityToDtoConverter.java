package rec.converters.dtoImp;

import org.springframework.stereotype.Component;
import rec.converters.ConverterAdapter;
import rec.model.dto.UserDto;
import rec.model.entity.UserEntity;

@Component
public class UserEntityToDtoConverter extends ConverterAdapter<UserDto, UserEntity> {

    @Override
    public UserDto convert(UserDto target, UserEntity source) {
        if(target == null || source == null)
            return null;
        target.setId(source.getId());
        target.setContactNumber(source.getContactNumber());
        target.setEmail(source.getEmail());
        target.setFirstname(source.getFirstname());
        target.setLastname(source.getLastname());
        target.setPesel(source.getPesel());
        target.setSex(source.getSex());
        target.setUserStatus(source.getUserStatus());

        return target;
    }
}
