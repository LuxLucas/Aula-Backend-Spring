package com.example.Estudantes.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter 
@Setter

public class Student {

    protected int id;
    protected String name;
    protected String course;
    protected String email;
    protected String telephone;

}
