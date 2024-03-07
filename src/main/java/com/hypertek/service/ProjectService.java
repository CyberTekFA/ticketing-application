package com.hypertek.service;

import com.hypertek.dto.ProjectDTO;
import com.hypertek.repository.CrudRepository;

public interface ProjectService extends CrudRepository<ProjectDTO,String> {
}
