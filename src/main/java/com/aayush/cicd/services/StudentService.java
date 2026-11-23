package com.aayush.cicd.services;

import com.aayush.cicd.models.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> getAllStudents() {

        return List.of(
                new Student(101, "Rahul Sharma", "rahul@gmail.com", "demo101"),
                new Student(102, "Priya Verma", "priya@gmail.com", "demo102"),
                new Student(103, "Amit Patel", "amit@gmail.com", "demo103"),
                new Student(104, "Sneha Gupta", "sneha@gmail.com", "demo104"),
                new Student(105, "Rohit Singh", "rohit@gmail.com", "demo105")
        );
    }
}