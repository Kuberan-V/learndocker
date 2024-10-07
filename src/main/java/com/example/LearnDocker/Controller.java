package com.example.LearnDocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/learn/{name}")
    public String learnDoc(@PathVariable String name){
        return "Hi this a learning docker - "+name;

    }
}
