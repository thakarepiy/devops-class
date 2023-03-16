package com.example.devopsclass;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class maven {
    @GetMapping("/maven")
    public String getData(){
        return "Please start your maven learning";
    }
}
