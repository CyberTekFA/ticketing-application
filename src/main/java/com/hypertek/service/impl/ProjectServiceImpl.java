package com.hypertek.service.impl;

import com.hypertek.dto.ProjectDTO;

import com.hypertek.enums.STATUS;
import com.hypertek.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImpl extends AbstractMapService<String, ProjectDTO> implements ProjectService {
    @Override
    public ProjectDTO save(ProjectDTO object) {

        if(object.getStatus() == null){
            object.setStatus(STATUS.OPEN);
        }

        return super.save(object.getProjectCode(),object);
    }

    @Override
    public List<ProjectDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void update(ProjectDTO object) {

        ProjectDTO newproject = findById(object.getProjectCode());

        if(object.getStatus() == null)
            object.setStatus(newproject.getStatus());
        super.update(object.getProjectCode(),object);
    }

    @Override
    public void deleteById(String id) {
        super.deleteById(id);
    }

    @Override
    public ProjectDTO findById(String id) {
        return super.findById(id);
    }

    @Override
    public void complete(ProjectDTO project) {
        project.setStatus(STATUS.COMPLETE);
        super.save(project.getProjectCode(),project);
    }

    @Override
    public List<String> findAllProjects() {
        return super.findAll().stream()
                .map(ProjectDTO::getProjectName).collect(Collectors.toList());
    }
}
