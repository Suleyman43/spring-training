package com.cydeo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class MentorController {


    //@RequestMapping("/register")
    @GetMapping("/register")
    public String register(){

        return "mentor/register";
    }


}
