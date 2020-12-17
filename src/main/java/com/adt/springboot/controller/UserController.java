package com.adt.springboot.controller;

import com.adt.springboot.entity.MyUser;
import com.adt.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/userAdd")
    public String toUserAdd(){
        return "userAdd";
    }

    @PostMapping("/add")
    public String add(MyUser user){
        userService.addUser(user);
        return "success";
    }
}
