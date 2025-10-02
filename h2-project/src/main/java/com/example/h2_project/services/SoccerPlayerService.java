package com.example.h2_project.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.h2_project.models.SoccerPlayer;
import com.example.h2_project.repositories.SoccerPlayerRepository;

@Service
public class SoccerPlayerService {

    private SoccerPlayerRepository soccerPlayerRepository;

    public SoccerPlayerService(SoccerPlayerRepository soccerPlayerRepository){
        this.soccerPlayerRepository = soccerPlayerRepository;
    }
    
    public SoccerPlayer saveSoccerPlayer(String firstName, String lastName){
        SoccerPlayer newPlayer = new SoccerPlayer();
        newPlayer.setFirstName(firstName);
        newPlayer.setLastName(lastName);
        newPlayer.setTeam("Criciúma");
        soccerPlayerRepository.save(newPlayer);
        return newPlayer;
    }

    public List<SoccerPlayer> getAllSoccerPlayers(){
        return soccerPlayerRepository.findAll();
    }

}
