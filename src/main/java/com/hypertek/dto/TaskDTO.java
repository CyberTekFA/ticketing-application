package com.hypertek.dto;

import com.hypertek.dto.ProjectDTO;
import com.hypertek.dto.UserDto;
import com.hypertek.enums.STATUS;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor
@Data
public class TaskDTO {

    private Long id;
    private ProjectDTO project;
    private UserDto assignedEmployee;
    private String taskSubject;
    private String taskDetail;
    private STATUS taskStatus;
    private LocalDate assignedDate;

    public TaskDTO(ProjectDTO project, UserDto assignedEmployee, String taskSubject, String taskDetail, STATUS taskStatus, LocalDate assignedDate) {
        this.project = project;
        this.assignedEmployee = assignedEmployee;
        this.taskSubject = taskSubject;
        this.taskDetail = taskDetail;
        this.taskStatus = taskStatus;
        this.assignedDate = assignedDate;
        this.id = UUID.randomUUID().getMostSignificantBits();
    }
}