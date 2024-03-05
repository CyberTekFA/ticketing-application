package com.hypertek.service.impl;

import com.hypertek.dto.UserDto;
import com.hypertek.repository.CrudRepository;
import com.hypertek.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    private final UserService userService;

    public UserServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDto save(UserDto userDto) {
        return userService.save(userDto);
    }

    @Override
    public UserDto findById(String Id) {
        return userService.findById(Id);
    }

    @Override
    public UserDto updateById(String id) {
        return userService.updateById(id);
    }

    @Override
    public List<UserDto> findAll() {
        return userService.findAll();
    }

    @Override
    public void delete(UserDto userDto) {
        userService.delete(userDto);
    }

    @Override
    public void deleteById(String id) {
        userService.deleteById(id);
    }
}
