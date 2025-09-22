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
import com.example.PlayListWeb.service.MusicService;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;
import java.lang.IllegalArgumentException;

@RestController
@RequestMapping("/music")

public class MusicController {
    
    @Autowired
    private MusicService musicService;

    @GetMapping
    public ArrayList<Music> getAll(){
        return musicService.getAll();
    }

    @GetMapping("/{id}")
    public Music findById(@PathVariable int id){
        return musicService.findById(id);
    }

    @PostMapping
    public Music add(@RequestBody @Valid Music music){
        if(musicService.musicExist(music.getId())){
            throw new IllegalArgumentException("Valor de 'id' já existe");
        }

        musicService.add(music);
        return music;
    }
}
