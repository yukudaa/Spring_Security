package com.practice.SpringSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String loginP(){  //login.mustache로 redirect
        return "login";
    }
}
