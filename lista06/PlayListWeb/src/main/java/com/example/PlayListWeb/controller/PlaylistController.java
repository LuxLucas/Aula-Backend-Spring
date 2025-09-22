package com.example.PlayListWeb.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.validation.Valid;

import com.example.PlayListWeb.model.Music;
import com.example.PlayListWeb.model.Playlist;
import com.example.PlayListWeb.service.MusicService;
import com.example.PlayListWeb.service.PlaylistService;

import java.lang.IllegalArgumentException;
import java.util.ArrayList;

@RestController
@RequestMapping("/playlist")

public class PlaylistController {
    
    @Autowired
    private MusicService musicService;

    @Autowired
    private PlaylistService playlistService;

    @GetMapping
    public ArrayList<Playlist> getAll(){
        return playlistService.getAll();
    }

    @GetMapping("/{id}")
    public Playlist findById(@PathVariable int id){
        return playlistService.findById(id);
    }

    @PostMapping
    public Playlist add(@RequestBody @Valid Playlist playlist){
        if(playlistService.playlistExist(playlist.getId())){
            throw new IllegalArgumentException("Valor de 'id' já existe");
        }

        playlistService.add(playlist);
        return playlist;
    }

    @PostMapping("/{playlistId}/musics/{musicId}")
    public Playlist addMusic(
        @PathVariable int playlistId,
        @PathVariable int musicId
    ){
        Playlist playlist   = playlistService.findById(playlistId);
        Music music         = musicService.findById(musicId);

        if(playlist == null || music == null){
            throw new IllegalArgumentException("Propriedade 'id' de Playlist ou Music não existe");
        }

        playlist.addMusic(music);
        return playlist;
    } 
}
