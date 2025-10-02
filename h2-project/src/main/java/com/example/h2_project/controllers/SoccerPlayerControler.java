package com.example.h2_project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.example.h2_project.models.SoccerPlayer;
import com.example.h2_project.services.SoccerPlayerService;

@RestController
@RequestMapping("/soccer-players")
public class SoccerPlayerControler {
    
    private SoccerPlayerService soccerPlayerService;

    public SoccerPlayerControler(SoccerPlayerService soccerPlayerService){
        this.soccerPlayerService = soccerPlayerService;
    }

    @PostMapping
    public SoccerPlayer saveSoccerPlayer(@RequestBody SoccerPlayer player){
        return soccerPlayerService.saveSoccerPlayer(player.getFirstName(), player.getLastName());
    }

    @GetMapping
    public List<SoccerPlayer> getAllSoccerPlayers(){
        return soccerPlayerService.getAllSoccerPlayers();
    }

}
