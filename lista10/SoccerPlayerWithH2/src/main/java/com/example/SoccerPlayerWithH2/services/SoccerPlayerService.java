package com.example.SoccerPlayerWithH2.services;

import com.example.SoccerPlayerWithH2.models.SoccerPlayer;
import com.example.SoccerPlayerWithH2.repositories.SoccerPlayerRepository;
import java.util.List;
import java.util.UUID;

public class SoccerPlayerService {
    
    private SoccerPlayerRepository soccerPlayerRepository;

    public SoccerPlayerService(SoccerPlayerRepository soccerPlayerRepository){
        this.soccerPlayerRepository = soccerPlayerRepository;
    }

    public List<SoccerPlayer> findAll(){
        return soccerPlayerRepository.findAll();
    }

    public SoccerPlayer findById(UUID id){
        return soccerPlayerRepository.findById(id).get();
    }

    public List<SoccerPlayer> findByFirstName(String firstName){
        return soccerPlayerRepository.findByFirstName(firstName);
    }

    public SoccerPlayer save(SoccerPlayer soccerPlayer){
        soccerPlayerRepository.save(soccerPlayer);
        return soccerPlayer;
    }

    public SoccerPlayer removeById(UUID id){
        SoccerPlayer player = findById(id);
        soccerPlayerRepository.deleteById(id);
        return player;
    }

}
