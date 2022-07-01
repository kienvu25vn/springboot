package com.springbuoi3.controller;


import com.springbuoi3.entity.Sentence;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/greeting")
    public Sentence home(){
        return new Sentence(1 , "Hello, World!");
    }

    @GetMapping("/greeting/{name}")
    public Sentence home(@PathVariable String name){
        return new Sentence(1 , "Hello, " + name + "!");
    }
}
