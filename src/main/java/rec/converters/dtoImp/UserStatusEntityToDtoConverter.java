package rec.converters.dtoImp;

import org.springframework.stereotype.Component;
import rec.converters.ConverterAdapter;
import rec.model.dto.UserStatusDto;
import rec.model.entity.UserStatusEntity;

@Component
public class UserStatusEntityToDtoConverter extends ConverterAdapter<UserStatusDto, UserStatusEntity> {
    @Override
    public UserStatusDto convert(UserStatusDto target, UserStatusEntity source) {
        if(target == null || source == null)
            return null;
        target.setId(source.getId());
        target.setStatus(source.getStatus());

        return target;
    }
}
