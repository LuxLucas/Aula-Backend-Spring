package com.example.Estudantes.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.Estudantes.service.StudentService;
import com.example.Estudantes.model.Student;

import javax.management.RuntimeErrorException;
import java.util.List;

@RestController
@RequestMapping("/estudante")
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAll(){
        return studentService.getAll();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable int id){
        if(!studentService.isValidId(id)){
            throw new RuntimeErrorException(new Error("O ID " + id + " é inválido."));
        }
        return studentService.findById(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        studentService.add(student);
        return student;
    }

}
