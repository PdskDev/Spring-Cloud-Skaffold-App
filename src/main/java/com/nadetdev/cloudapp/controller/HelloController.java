package com.nadetdev.cloudapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(
            @RequestParam(defaultValue = "NadetDev", name = "dev", required = false) String dev,
            Model model){
        model.addAttribute("dev", dev);
        return "index";

    }
}
