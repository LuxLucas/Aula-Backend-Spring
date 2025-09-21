package com.example.Estudantes.service;

import org.springframework.stereotype.Service;

import com.example.Estudantes.model.Student;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class StudentService {

    public List<Student> students = new ArrayList<>();

    public List<Student> getAll(){
        return students;
    }

    public boolean isValidId(int id){
        return id >= 0;
    }

    public Student findById(int id){
        Optional<Student> studentFound = students.stream()
                                        .filter(student -> student.getId() == id)
                                        .findFirst(); 

        return studentFound.get();
    }

    public void add(Student student){
        this.students.add(student);
    }
}
