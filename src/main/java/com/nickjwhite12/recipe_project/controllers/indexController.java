package com.nickjwhite12.recipe_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(){
        System.out.println("4446542");
        return "index";
    }
}
