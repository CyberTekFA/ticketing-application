package com.hypertek.service;

import com.hypertek.dto.UserDto;
import com.hypertek.repository.CrudRepository;



public interface UserService extends CrudRepository<UserDto,String> {

}
