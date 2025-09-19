package com.backend.TimeDeFutebol.services;

import org.springframework.stereotype.Service;

import com.backend.TimeDeFutebol.services.SoccerPlayer;
import java.util.List;

@Service
public class TimeDeFutebolService {
    
    public List<SoccerPlayer> createListOfSoccerPlayer(){
        List<SoccerPlayer> listOfSoccerPlayer = new List<SoccerPlayer>();
        for(int i = 0; i < 11; i++){
            listOfSoccerPlayer.add(SoccerPlayer.createRandom());
        }
        return listOfSoccerPlayer;
    }
}
