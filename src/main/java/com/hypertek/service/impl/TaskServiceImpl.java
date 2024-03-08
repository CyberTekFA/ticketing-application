package com.hypertek.service.impl;
import com.hypertek.dto.TaskDTO;
import com.hypertek.service.TaskService;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TaskServiceImpl extends AbstractMapService<String, TaskDTO> implements TaskService {

    @Override
    public TaskDTO save(TaskDTO taskDTO) {
        return super.save(taskDTO.getProjectName().getProjectCode(),taskDTO);
    }

    @Override
    public TaskDTO findById(String id) {
        return super.findById(id);
    }

    @Override
    public List<TaskDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void update(TaskDTO taskDTO) {
        super.update(taskDTO.getProjectName().getProjectCode(),taskDTO);
    }

    @Override
    public void deleteById(String id) {
        super.deleteById(id);
    }

}
