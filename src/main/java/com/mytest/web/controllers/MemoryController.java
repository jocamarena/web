package com.mytest.web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/memory")
public class MemoryController {
    @GetMapping
    public String getHome(){
        return "home";
    }

}
