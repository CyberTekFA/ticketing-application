package com.hypertek.service;

import com.hypertek.dto.UserDto;
import com.hypertek.repository.CrudRepository;

import java.util.List;


public interface UserService extends CrudRepository<UserDto,String> {
    List<UserDto> findAllManagers();

}
