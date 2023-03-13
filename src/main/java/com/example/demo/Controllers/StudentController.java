package com.example.demo.Controllers;

import com.example.demo.Models.Student;
import com.example.demo.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {


    private final StudentService service;
    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }


    @GetMapping
    public List<Student> findAllStudents() {
        return service.findAllStudents();
    }
}
