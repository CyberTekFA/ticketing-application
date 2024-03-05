package com.hypertek.service;

import com.hypertek.dto.RoleDto;
import com.hypertek.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


public interface RoleService extends CrudRepository<RoleDto,Long> {

}
