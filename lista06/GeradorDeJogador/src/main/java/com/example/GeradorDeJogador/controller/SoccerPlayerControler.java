package com.example.GeradorDeJogador.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.GeradorDeJogador.utils.SoccerPlayer;

@RestController
@RequestMapping("/jogador")
public class SoccerPlayerControler {
    
    @GetMapping("/{team}/{position}")
    public SoccerPlayer getSoccerPlayer(
        @PathVariable("team") String team,
        @PathVariable("position") String position
    ) {
        return new SoccerPlayer(position, team);
    }
    
}
