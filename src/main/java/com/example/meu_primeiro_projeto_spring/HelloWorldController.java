package com.example.meu_primeiro_projeto_spring;

import org.springframework.web.bind.annotation.*;

@RestController // Uma anotation
public class HelloWorldController {

    @GetMapping("/") //rota com query selection
    public String greetTheWorld(@RequestParam String name) {
        return "Hello, %s".formatted(name);
    }

    @PostMapping("/soccerPlayer")  //
    public SoccerPlayer transferClub(@RequestBody SoccerPlayer soccerPlayer){
        soccerPlayer.setClub("Criciúma");
        return soccerPlayer;
    }
}
