package com.hypertek.service.impl;

import com.hypertek.dto.UserDto;
import com.hypertek.service.UserService;

import java.util.List;

public class UserServiceImpl extends AbstractMapService<String,UserDto> implements UserService{


    @Override
    public UserDto save(UserDto userDto) {
        return super.save(userDto.getUsername(),userDto);
    }

    @Override
    public UserDto findById(String id) {
        return super.findById(id);
    }

    @Override
    public List<UserDto> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(String id) {
        super.deleteById(id);
    }
}
