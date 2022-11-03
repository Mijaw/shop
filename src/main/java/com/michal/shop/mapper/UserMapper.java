package com.michal.shop.mapper;

import com.michal.shop.model.dao.User;
import com.michal.shop.model.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "password",ignore = true)
    UserDto doaToDto (User user);
    User dtoToDao (UserDto userDto);
}
