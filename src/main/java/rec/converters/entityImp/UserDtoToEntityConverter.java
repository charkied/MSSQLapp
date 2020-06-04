package rec.converters.entityImp;

import org.springframework.stereotype.Component;
import rec.converters.ConverterAdapter;
import rec.model.dto.UserDto;
import rec.model.entity.UserEntity;

@Component
public class UserDtoToEntityConverter extends ConverterAdapter<UserEntity, UserDto> {
    @Override
    public UserEntity convert(UserEntity target, UserDto source) {
        if(target == null || source == null)
            return null;
        target.setContactNumber(source.getContactNumber());
        target.setEmail(source.getEmail());
        target.setId(source.getId());
        target.setFirstname(source.getFirstname());
        target.setLastname(source.getLastname());
        target.setPesel(source.getPesel());
        target.setSex(source.getSex());
        target.setUserStatus(source.getUserStatus());

        return target;
    }
}
