//package com.michal.shop.mapper.impl;
//
//import com.michal.shop.mapper.UserMapper;
//import com.michal.shop.model.dao.User;
//import com.michal.shop.model.dto.UserDto;
//import org.springframework.stereotype.Component;
//
//@Component
//public class UserMapperImpl implements UserMapper {
//    @Override
//    public UserDto doaToDto(User user) {
//        return UserDto.builder()
//                .id(user.getId())
//                .email(user.getEmail())
//                .firstname(user.getFirstname())
//                .lastname(user.getLastname())
//                .password(user.getPassword())
//                .build();
//    }
//
//    @Override
//    public User dtoToDao(UserDto userDto) {
//        return User.builder()
//                .id(userDto.getId())
//                .email(userDto.getEmail())
//                .firstname(userDto.getFirstname())
//                .lastname(userDto.getLastname())
//                .password(userDto.getPassword())
//                .build();
//    }
//}
