package rec.services.imp;

import org.springframework.stereotype.Service;
import rec.converters.Converter;
import rec.model.dto.UserStatusDto;
import rec.model.entity.UserStatusEntity;
import rec.repositories.UserStatusRepository;
import rec.services.UserStatusService;

import java.util.List;

@Service
public class UserStatusServiceImp implements UserStatusService {

    private final UserStatusRepository userStatusRepository;

    private final Converter<UserStatusDto, UserStatusEntity> userStatusEntityToDtoConverter;
    private final Converter<UserStatusEntity, UserStatusDto> userStatusDtoToEntityConverter;

    public UserStatusServiceImp(UserStatusRepository userStatusRepository, Converter<UserStatusDto, UserStatusEntity> userStatusEntityToDtoConverter, Converter<UserStatusEntity, UserStatusDto> userStatusDtoToEntityConverter) {
        this.userStatusDtoToEntityConverter = userStatusDtoToEntityConverter;
        this.userStatusEntityToDtoConverter = userStatusEntityToDtoConverter;
        this.userStatusRepository = userStatusRepository;
    }

    @Override
    public UserStatusDto findById(Long id) {
        return userStatusEntityToDtoConverter.convert(
                userStatusRepository.findById(id).orElse(null)
        );
    }

    @Override
    public List<UserStatusDto> findAll() {
        return userStatusEntityToDtoConverter.convertToList(
                userStatusRepository.findAll()
        );
    }
    //TODO
    @Override
    public UserStatusDto saveNew(String name) {
        return null;
    }
    //TODO
    @Override
    public UserStatusDto save(UserStatusDto userStatusDto) {
        //validator
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        if (!userStatusRepository.existsById(id))
        return false;

        userStatusRepository.deleteById(id);
        return true;
    }
}
