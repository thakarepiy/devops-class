package com.example.devopsclass;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class docker {
    @GetMapping("/docker")
    public String getData(){
        return "Please start your learning for docker";
    }
}
