package com.example.PlayListWeb.service;

import org.springframework.stereotype.Service;

import com.example.PlayListWeb.model.Playlist;

import java.util.ArrayList;
import java.util.Optional;
import java.util.NoSuchElementException;

@Service
public class PlaylistService {
    
    private ArrayList<Playlist> playlists = new ArrayList<>();

    public Playlist add(Playlist playlist){
        playlists.add(playlist);
        return playlist;
    }

    public ArrayList<Playlist> getAll(){
        return playlists;
    }

    public Playlist findById(int id){
        Optional<Playlist> playlistFound = this.playlists.stream()
                                    .filter(playlist -> playlist.getId() == id)
                                    .findFirst();

        return playlistFound.get();
    }

    public boolean playlistExist(int id){
        boolean exist = true;

        try{
            this.findById(id);
        }catch(NoSuchElementException e){
            exist = false;
        }

        return exist;
    }
}