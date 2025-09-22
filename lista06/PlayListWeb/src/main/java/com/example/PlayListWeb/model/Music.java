package com.example.PlayListWeb.model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@AllArgsConstructor
@Getter
@Setter

public class Music {
    
    @Min(value=1, message="A popriedade 'id' não pode ser menor ou igual a 0.")
    protected int id;

    @NotBlank(message = "A propriedade 'name' está vazia.")
    protected String name;

    @NotBlank(message = "A propriedade 'artist' está vazia.")
    protected String artist;

    @NotBlank(message = "A propriedade 'album' está vazia.")
    protected String album;

    @Min(value=1, message="A popriedade 'duuration' não pode ser menor ou igual a 0.")
    protected int duration;

    @NotBlank(message = "A propriedade 'genre' está vazia.")
    protected String genre;

}
