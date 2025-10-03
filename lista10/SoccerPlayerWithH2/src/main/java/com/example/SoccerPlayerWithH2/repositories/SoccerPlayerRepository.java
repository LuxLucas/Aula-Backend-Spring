package com.example.SoccerPlayerWithH2.repositories;

import java.util.UUID;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SoccerPlayerWithH2.models.SoccerPlayer;

public interface SoccerPlayerRepository extends  JpaRepository<SoccerPlayer, UUID>{
    
    List<SoccerPlayer> findByFirstName(String firstName);

}
