package com.example.demo.Services;

import com.example.demo.Models.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {


    public List<Student> findAllStudents() {
        return List.of(
                new Student("Andrey", "Kolobov",
                        LocalDate.now(), "gel@list.ru", 18),
                new Student("Kate", "Maksimova",
                        LocalDate.now(), "maks@mail.ru", 19)
        );
    }
}

