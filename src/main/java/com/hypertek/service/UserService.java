package com.hypertek.service;

import com.hypertek.dto.ProjectDTO;
import com.hypertek.dto.UserDto;
import com.hypertek.enums.STATUS;
import com.hypertek.repository.CrudRepository;

import java.util.List;


public interface UserService extends CrudRepository<UserDto,String> {
    List<UserDto> findAllManagers();
    List<UserDto> findAllEmployees();

}
