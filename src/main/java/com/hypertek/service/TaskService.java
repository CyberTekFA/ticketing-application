package com.hypertek.service;

import com.hypertek.dto.TaskDTO;
import com.hypertek.dto.UserDto;
import com.hypertek.enums.STATUS;
import com.hypertek.repository.CrudRepository;

import java.util.List;

public interface TaskService extends CrudRepository<TaskDTO,Long> {
    List<TaskDTO> findTasksByManager(UserDto manager);

    List<TaskDTO> findAllTasksByStatus(STATUS status);

    List<TaskDTO> findAllTasksByStatusIsNot(STATUS status);

    void updateStatus(TaskDTO task);
}
