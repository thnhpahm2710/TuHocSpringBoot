package com.example.tuhocspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TuHocSpringBootController {

    @GetMapping("/hello")
    String sayHello(){
        return "Say hello";
    }
}
