package com.example.h2_project.dtos;

import java.util.UUID;

public record SoccerPlayerResponseDTO(
    UUID id,
    String firstName, 
    String lastName
) {}
