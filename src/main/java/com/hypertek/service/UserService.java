package com.hypertek.service;

import com.hypertek.dto.UserDto;
import com.hypertek.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface UserService extends CrudRepository<UserDto,String> {

}
