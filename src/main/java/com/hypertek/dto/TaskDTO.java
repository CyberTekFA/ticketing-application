package com.hypertek.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDTO {
    private ProjectDTO projectName;
    private UserDto assignedEmployee;
    private String taskSubject;
    private String taskDetails;

}
