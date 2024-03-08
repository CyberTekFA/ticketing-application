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
    public ProjectDTO save(ProjectDTO projectDTO) {
        if (projectDTO.getStatus() == null){
            projectDTO.setStatus(STATUS.OPEN);
        }
        if (projectDTO.getAssignedManager().getRole() == null){
            projectDTO.setAssignedManager(projectDTO.getAssignedManager());
        }
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
        if (object.getStatus().getValue() == null){
            ProjectDTO newStatus = findById(object.getProjectCode());
            object.setStatus(newStatus.getStatus());
        }
        super.update(object.getProjectCode(),object);
    }

    @Override
    public void deleteById(String id) {
        super.deleteById(id);
    }

    @Override
    public void complete(ProjectDTO projectDTO) {
        projectDTO.setStatus(STATUS.COMPLETE);
        super.save(projectDTO.getProjectCode(),projectDTO);
    }

    @Override
    public List<String> findAllProjects() {
        return super.findAll().stream()
                .map(ProjectDTO::getProjectName).collect(Collectors.toList());
    }

}
