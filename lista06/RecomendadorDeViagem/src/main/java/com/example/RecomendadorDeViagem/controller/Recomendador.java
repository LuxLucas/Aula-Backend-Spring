package com.example.RecomendadorDeViagem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@RestController
public class Recomendador {

    private String climate;
    private String style;

    protected String compareSuggestionsToGenerateRavelRecommendations(String climate, String style){
        String ravelRecommendation = "SESI Lab";

        if(climate.equals("heat") && style.equals("urban")){
            ravelRecommendation = "Florianópolis";
        }
        if(climate.equals("heat") && style.equals("nature")){
            ravelRecommendation = "Fernando de Noronha";
        }
        if(climate.equals("cold") && style.equals("urban")){
            ravelRecommendation = "Campos do Jordão";
        }
        if(climate.equals("cold") && style.equals("nature")){
            ravelRecommendation = "São Joaquim";
        }

        return ravelRecommendation;
    }

    @GetMapping("/recommend")
    public String recommendATrip(
        @RequestParam(defaultValue = "heat") String climate,
        @RequestParam(defaultValue = "nature") String style
    ) {
        String recommendation = compareSuggestionsToGenerateRavelRecommendations(climate, style);
        return "Recomendamos visitar %s".formatted(recommendation);
    }
    
}
