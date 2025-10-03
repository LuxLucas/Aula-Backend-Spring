package com.example.SoccerPlayerWithH2.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.SoccerPlayerWithH2.models.SoccerPlayer;
import com.example.SoccerPlayerWithH2.services.SoccerPlayerService;

@RequestMapping("/soccer-players")
public class SoccerPlayerController {
    
    private SoccerPlayerService soccerPlayerService;

    public SoccerPlayerController(SoccerPlayerService soccerPlayerService){
        this.soccerPlayerService = soccerPlayerService;
    }

    @GetMapping
    public List<SoccerPlayer> getAll(){
        return soccerPlayerService.findAll();
    }

    @GetMapping
    public SoccerPlayer getById(@RequestParam UUID id){
        return soccerPlayerService.findById(id);
    }

    @GetMapping
    public List<SoccerPlayer> findByFirstName(@RequestParam String firstName){
        return soccerPlayerService.findByFirstName(firstName);
    }

    @PostMapping
    public SoccerPlayer save(@RequestBody SoccerPlayer soccerPlayer){
        soccerPlayerService.save(soccerPlayer);
        return soccerPlayer;
    }

    @DeleteMapping 
    public SoccerPlayer remove(@RequestParam UUID id){
        SoccerPlayer player = soccerPlayerService.findById(id);
        soccerPlayerService.removeById(id);
        return player;
    }

}
