package com.example.h2_project.mappers;

import com.example.h2_project.models.SoccerPlayer;
import com.example.h2_project.dtos.SoccerPlayerResponseDTO;

public class SoccerPlayerMapper {
    
    public SoccerPlayerResponseDTO toDTO(SoccerPlayer soccerPlayer){
        return new SoccerPlayerResponseDTO(
            soccerPlayer.getId(),
            soccerPlayer.getFirstName(),
            soccerPlayer.getLastName()
        );
    }

}
