package com.hypertek.service;

import com.hypertek.dto.UserDto;
import com.hypertek.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService extends CrudRepository<UserDto,String> {

}
