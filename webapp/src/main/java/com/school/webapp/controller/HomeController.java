package com.school.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = {"/home","","/study"})
    public String displayhome(){
        return "index.html";
    }

    @RequestMapping("/dhome")
    public String displayhomeDynamic(Model model)
    {
        model.addAttribute("username","Dharm Vashisth");
        return "home.html";
    }
}
