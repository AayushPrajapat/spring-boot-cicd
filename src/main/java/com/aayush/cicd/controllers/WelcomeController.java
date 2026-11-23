package com.aayush.cicd.controllers;

import com.aayush.cicd.models.Student;
import com.aayush.cicd.services.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    private final StudentService studentService;

    public WelcomeController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok(
                "Welcome to the Spring Boot API with learning CICD..!!"
        );
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }
}
