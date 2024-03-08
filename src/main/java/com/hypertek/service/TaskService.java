package com.hypertek.service;

import com.hypertek.dto.TaskDTO;
import com.hypertek.dto.UserDto;
import com.hypertek.repository.CrudRepository;

import java.util.List;

public interface TaskService extends CrudRepository<TaskDTO,String>{

}
