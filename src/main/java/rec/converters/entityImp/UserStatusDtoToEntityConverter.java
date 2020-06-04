package rec.converters.entityImp;

import org.springframework.stereotype.Component;
import rec.converters.ConverterAdapter;
import rec.model.dto.UserStatusDto;
import rec.model.entity.UserStatusEntity;

@Component
public class UserStatusDtoToEntityConverter extends ConverterAdapter<UserStatusEntity, UserStatusDto> {
    @Override
    public UserStatusEntity convert(UserStatusEntity target, UserStatusDto source) {
        if(target == null || source == null)
            return null;
        target.setId(source.getId());
        target.setStatus(source.getStatus());
        return target;
    }
}
