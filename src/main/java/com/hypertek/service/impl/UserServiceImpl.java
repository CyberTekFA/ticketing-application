package com.hypertek.service.impl;

import com.hypertek.dto.RoleDto;
import com.hypertek.dto.UserDto;
import com.hypertek.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
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
    @Override
    public void update(UserDto object) {
        super.update(object.getUsername(),object);
    }

    @Override
    public List<UserDto> findAllManagers() {
        return super.findAll().stream().filter(user->user.getRole().getId()==2).collect(Collectors.toList());
    }
}
