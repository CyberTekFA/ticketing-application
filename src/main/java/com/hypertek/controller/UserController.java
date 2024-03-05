package com.hypertek.controller;
import com.hypertek.dto.UserDto;
import com.hypertek.service.impl.RoleServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    private RoleServiceImpl roleService;

    public UserController(RoleServiceImpl roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/create")
    public String createUser(Model model){
        model.addAttribute("user",new UserDto());
        model.addAttribute("roles",roleService.findAll());
        return "/user/create";
    }

}
