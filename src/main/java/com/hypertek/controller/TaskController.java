package com.hypertek.controller;

import com.hypertek.dto.ProjectDTO;
import com.hypertek.dto.TaskDTO;
import com.hypertek.service.ProjectService;
import com.hypertek.service.TaskService;
import com.hypertek.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/task")
public class TaskController {
    private UserService userService;
    private TaskService taskService;
    private ProjectService projectService;

    public TaskController(UserService userService, TaskService taskService,ProjectService projectService) {
        this.userService = userService;
        this.taskService = taskService;
        this.projectService = projectService;
    }

    @GetMapping("/create")
    public String getTask( Model model){
        model.addAttribute("task", new TaskDTO());
        model.addAttribute("projects",projectService.findAllProjects());
        model.addAttribute("employees",userService.findAllEmployees());


        return "/task/create";
    }
}
