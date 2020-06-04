package rec.services;

import rec.model.dto.UserStatusDto;

import java.util.List;

public interface UserStatusService {

    UserStatusDto findById(Long id);

    List<UserStatusDto> findAll();

    UserStatusDto saveNew(String name);

    UserStatusDto save(UserStatusDto userStatusDto);

    boolean deleteById(Long id);
}
