package com.example.WEBSR26.controller;

import com.sun.istack.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    private String

    @GetMapping("/user")
    public String sayHello(Model theModel){
        theModel.addAttribute("theDate", new java.util.Date());
        return "Users/User";

    }

}
