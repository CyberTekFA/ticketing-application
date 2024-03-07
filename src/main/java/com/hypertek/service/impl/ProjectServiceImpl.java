package com.hypertek.service.impl;

import com.hypertek.dto.ProjectDTO;

import com.hypertek.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl extends AbstractMapService<String, ProjectDTO> implements ProjectService {

    @Override
    public ProjectDTO save(ProjectDTO projectDTO) {
        return super.save(projectDTO.getProjectCode(),projectDTO);
    }

    @Override
    public ProjectDTO findById(String id) {
        return super.findById(id);
    }

    @Override
    public List<ProjectDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void update(ProjectDTO object) {
        super.update(object.getProjectCode(),object);
    }

    @Override
    public void deleteById(String id) {
        super.deleteById(id);
    }
}
