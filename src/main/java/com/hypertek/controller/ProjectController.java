package com.hypertek.controller;

import com.hypertek.dto.ProjectDTO;
import com.hypertek.service.ProjectService;
import com.hypertek.service.RoleService;
import com.hypertek.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/project")
public class ProjectController {
    private final UserService userService;
    private final ProjectService projectService;


    public ProjectController(UserService userService, ProjectService projectService) {
        this.userService = userService;
        this.projectService = projectService;
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("project",new ProjectDTO());
        model.addAttribute("managers",userService.findAllManagers());
        model.addAttribute("projects",projectService.findAll());

        return "/project/create";
    }
    @PostMapping("/create")
    public String insertProject(@ModelAttribute("project") ProjectDTO project){
        projectService.save(project);
        return "redirect:/project/create";
    }
    @GetMapping("/delete/{id}")
    public String deleteProject(@PathVariable String id){
        projectService.deleteById(id);
        return "redirect:/project/create";
    }

    @GetMapping("/update/{id}")
    public String updateProject(@PathVariable("id") String id, Model model){
        model.addAttribute("project",projectService.findById(id));
        model.addAttribute("managers",userService.findAllManagers());
        model.addAttribute("projects",projectService.findAll());

        return "/project/update";
    }

    @PostMapping("/update")
    public String update(ProjectDTO projectDTO){
        projectService.update(projectDTO);
        return "redirect:/project/create";
    }

    @GetMapping("/complete/{id}")
    public String completeProject(@PathVariable("id") String id){
        projectService.complete(projectService.findById(id));
        return "redirect:/project/create";
    }
}
