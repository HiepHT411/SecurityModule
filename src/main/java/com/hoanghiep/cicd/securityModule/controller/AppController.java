package com.hoanghiep.cicd.securityModule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AppController {

    @GetMapping("/login")
    public String viewLoginPage() {
        return "login";
    }

    @GetMapping("/home")
    public String hello() {
        return "home.html";
    }

}
