package com.hypertek.mappers;

import com.hypertek.dto.UserDto;
import com.hypertek.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {


    UserMapper USER_MAPPER = Mappers.getMapper(UserMapper.class);

    UserDto mapToUserDto(User user);
    User mapToUser(UserDto userDto);
}
