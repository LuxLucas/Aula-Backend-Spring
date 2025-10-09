package com.example.h2_project.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.h2_project.models.SoccerPlayer;
import com.example.h2_project.repositories.SoccerPlayerRepository;
import com.example.h2_project.dtos.SoccerPlayerResponseDTO;
import com.example.h2_project.mappers.SoccerPlayerMapper;

@Service
public class SoccerPlayerService {

    private SoccerPlayerRepository soccerPlayerRepository;
    private SoccerPlayerMapper soccerPlayerMapper;

    public SoccerPlayerService(SoccerPlayerRepository soccerPlayerRepository, SoccerPlayerMapper soccerPlayerMapper){
        this.soccerPlayerRepository = soccerPlayerRepository;
        this.soccerPlayerMapper     = soccerPlayerMapper;
    }
    
    public SoccerPlayerResponseDTO saveSoccerPlayer(SoccerPlayerRequestDTO soccerPlayerRequestDTO){
        SoccerPlayer newPlayer = new SoccerPlayer();
        newPlayer.setFirstName(firstName);
        newPlayer.setLastName(lastName);
        newPlayer.setTeam("Criciúma");
        soccerPlayerRepository.save(newPlayer);
        return newPlayer;
    }

    /*
    public List<SoccerPlayer> getAllSoccerPlayers(){
        return soccerPlayerRepository.findAll();
    }
    */

    public List<SoccerPlayerResponseDTO> getAllSoccerPlayers(){
        return soccerPlayerRepository.findAll();
    }

}
