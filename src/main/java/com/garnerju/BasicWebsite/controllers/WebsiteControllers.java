package com.garnerju.BasicWebsite.controllers;

import com.garnerju.BasicWebsite.models.User;
import com.garnerju.BasicWebsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class WebsiteControllers {

    @Autowired
    UserService userService;


    @GetMapping("/")
    public String mainPage() {
        return "Welcome to the main page!";
    }

    @GetMapping("/main")
    public String userPage(Principal principal) {
        return "Welcome to the private user area of the site!";
    }

    @GetMapping("/admin")
    public String adminPage(Principal principal) {
        return "Welcome to the admin panel";
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User newUser) {  return userService.createUser(newUser); }
}
