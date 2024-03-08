package com.hypertek.service;

import com.hypertek.dto.ProjectDTO;
import com.hypertek.enums.STATUS;
import com.hypertek.repository.CrudRepository;

import java.util.List;

public interface ProjectService extends CrudRepository<ProjectDTO,String> {

    void complete(ProjectDTO projectDTO);
    List<String> findAllProjects();

}
