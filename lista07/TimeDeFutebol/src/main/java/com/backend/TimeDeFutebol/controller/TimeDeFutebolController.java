package com.backend.TimeDeFutebol;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.backend.TimeDeFutebol.services.SoccerPlayer;
import java.util.LinkedList;

@RestController
public class TimeDeFutebolController {
    
    @Autowired
    private TimeDeFutebolService timeDeFutebolService;

    private List<SoccerPlayer> mainPlayers = timeDeFutebolService.createListOfSoccerPlayer();
    private List<SoccerPlayer> reservePlayers = timeDeFutebolService.createListOfSoccerPlayer();

    @GetMapping("/principal")
    public List<SoccerPlayer> getMainSoccerPlayers(){
        return mainPlayers;
    }

}
