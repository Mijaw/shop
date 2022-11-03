package com.michal.shop.controller;

import com.michal.shop.mapper.UserMapper;
import com.michal.shop.model.dao.User;
import com.michal.shop.model.dto.UserDto;
import com.michal.shop.service.UserService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor

public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable Long id) {
        return userMapper.doaToDto(userService.getById(id));
    }
    @PostMapping
    public UserDto saveUser(@RequestBody @Valid UserDto user){
        return userMapper.doaToDto(userService.save(userMapper.dtoToDao(user)));
    }
    @PutMapping("/{id}")
    public UserDto updateUser(@RequestBody UserDto user, @PathVariable Long id){
        return userMapper.doaToDto(userService.update(userMapper.dtoToDao(user), id));
    }
    @GetMapping()
    public Page<UserDto> getUserPage(@RequestParam int page,@RequestParam int size){
        return userService.getPage(PageRequest.of(page, size)).map(userMapper::doaToDto);


    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.delete(id);
    }


}
