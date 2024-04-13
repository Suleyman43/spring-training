package com.cydeo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class MentorController {


    @RequestMapping("/register")
    public String register(){

        return "student/register";
    }


}
