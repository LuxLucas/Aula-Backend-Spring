package com.example.meu_primeiro_projeto_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Uma anotation
public class HelloWorldController {

    @GetMapping("/") //rota com query selection
    public String greetTheWorld(@RequestParam String name) {
        return "Hello, %s".formatted(name);
    }
}
