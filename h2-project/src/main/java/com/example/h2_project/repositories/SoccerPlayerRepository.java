package com.example.h2_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.h2_project.models.SoccerPlayer;
import java.util.UUID;

public interface SoccerPlayerRepository extends JpaRepository<SoccerPlayer, UUID>{


    
}
