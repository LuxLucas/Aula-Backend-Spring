package com.example.PlayListWeb.service;

import org.springframework.stereotype.Service;

import com.example.PlayListWeb.model.Music;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class MusicService {
    
    private ArrayList<Music> musics = new ArrayList<>();

    public Music add(Music music){
        musics.add(music);
        return music;
    }

    public ArrayList<Music> getAll(){
        return musics;
    }

    public Music findById(int id){
        Optional<Music> musicFound = this.musics.stream()
                                    .filter(music -> music.getId() == id)
                                    .findFirst();

        return musicFound.get();
    }

    public boolean musicExist(int id){
        boolean exist = true;

        try{
            this.findById(id);
        }catch(NoSuchElementException e){
            exist = false;
        }

        return exist;
    }
}
