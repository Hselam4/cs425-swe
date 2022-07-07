package com.edu.miu.cs.cs425.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping(value = {"/", "/eLibrary", "/eLibrary/home"})
    public String displayHomePage(){
        return "home/index";
    }

}
