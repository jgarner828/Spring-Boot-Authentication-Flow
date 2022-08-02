package com.garnerju.BasicWebsite.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class WebsiteControllers {


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

}
