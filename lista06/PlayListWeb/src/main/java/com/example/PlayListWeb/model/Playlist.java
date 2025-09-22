package com.example.PlayListWeb.model;

import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.util.List;
import java.util.ArrayList;

@RequiredArgsConstructor
@Getter
@Setter

public class Playlist {
    
    
    @Min(value=1, message="A popriedade 'id' não pode ser menor que 1.")
    protected int id;

    @NotBlank(message = "A propriedade 'name' está vazia.")
    protected String name;

    protected List<Music> musics = new ArrayList<>();

    public void addMusic(Music music){
        this.musics.add(music);
    }

}
