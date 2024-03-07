package com.hypertek.dto;

import com.hypertek.enums.STATUS;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProjectDTO {
    private String projectName;
    private String projectCode;
    private UserDto assignedManager;
    @DateTimeFormat(pattern = "MM-dd-YYYY")
    private LocalDate projectStartDate;
    @DateTimeFormat(pattern = "MM-dd-YYYY")
    private LocalDate projectEndDate;
    private String projectDetails;
    private STATUS status;
}
