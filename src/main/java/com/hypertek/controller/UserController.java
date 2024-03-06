package com.hypertek.controller;
import com.hypertek.dto.RoleDto;
import com.hypertek.dto.UserDto;
import com.hypertek.service.RoleService;
import com.hypertek.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    private final RoleService roleService;
    private final UserService userService;

    public UserController(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @GetMapping("/create")
    public String createUser(Model model){
        model.addAttribute("user",new UserDto());
        model.addAttribute("roles",roleService.findAll());
        model.addAttribute("users",userService.findAll());
        return "/user/create";
    }

    @PostMapping("/create")
    public String saveUser(@ModelAttribute("user") UserDto userDto, Model model){
        userService.save(userDto);
        return "redirect:/user/create";
    }
    @DeleteMapping("/create")
    public String deleteUser(@ModelAttribute("user")UserDto userDto ){
        userService.deleteById(userDto.getUsername());
        return "redirect:/user/create";
    }
}
