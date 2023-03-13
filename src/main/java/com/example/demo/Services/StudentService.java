package com.example.demo.Services;

import com.example.demo.Models.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.List;

@Component
public interface StudentService {
    List<Student> findAllStudents();

    Student save(Student s);
    Student findByEmail(String email);
    Student update(Student s);
    void delete(String email);
}

