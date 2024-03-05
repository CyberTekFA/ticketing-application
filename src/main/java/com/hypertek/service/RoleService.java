package com.hypertek.service;

import com.hypertek.dto.RoleDto;
import com.hypertek.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleService extends CrudRepository<RoleDto,Long> {

}
