package com.kiet.student.controller;

import com.kiet.student.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent() {
        return new Student(1, "Sumit", 20, "B.Tech CSE");
    }
}