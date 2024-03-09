package com.hypertek.service.impl;

import com.hypertek.dto.ProjectDTO;

import com.hypertek.dto.TaskDTO;
import com.hypertek.dto.UserDto;
import com.hypertek.enums.STATUS;
import com.hypertek.service.ProjectService;
import com.hypertek.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImpl extends AbstractMapService<ProjectDTO,String> implements ProjectService {

    private TaskService taskService;

    public ProjectServiceImpl(TaskService taskService) {
        this.taskService = taskService;
    }

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
        if (object.getStatus()== null){
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
    @Override
    public List<ProjectDTO> findAllNonCompletedProjects() {
        return findAll().stream().filter(project -> !project.getStatus().equals(STATUS.COMPLETE)).collect(Collectors.toList());
    }

    @Override
    public List<ProjectDTO> getCountedListOfProjectDTO(UserDto manager) {

        List<ProjectDTO> projectList =
                findAll()
                        .stream()
                        .filter(project -> project.getAssignedManager().equals(manager))
                        .map( project -> {

                            List<TaskDTO> taskList = taskService.findTasksByManager(manager);

                            int completeTaskCounts = (int)taskList.stream().filter(t ->  t.getProject().equals(project) && t.getTaskStatus() == STATUS.COMPLETE).count();

                            int unfinishedTaskCounts = (int)taskList.stream().filter(t ->  t.getProject().equals(project) && t.getTaskStatus() != STATUS.COMPLETE).count();

                            project.setCompleteTaskCounts(completeTaskCounts);
                            project.setUnfinishedTaskCounts(unfinishedTaskCounts);

                            return project;

                        }).collect(Collectors.toList());


        return projectList;
    }
}