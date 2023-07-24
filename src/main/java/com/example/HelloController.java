package com.example;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String welcome(Model model){
        model.addAttribute("hello", "welcome to spring framework");
        return "hello";
    }
}

