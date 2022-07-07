package com.edu.miu.cs.cs425.eregistral.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


    @Controller
    public class HomePageController {
        @GetMapping(value = {"/", "/eRegistral", "/eRegistral/home"})
        public String displayHomePage(){
            return "home/index";
        }

    }


