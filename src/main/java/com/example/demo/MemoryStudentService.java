package com.example.demo;

import com.example.demo.Models.Student;
import com.example.demo.Services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemoryStudentService implements StudentService {

    private final StudentDAO dao;

    public MemoryStudentService(StudentDAO dao) {
        this.dao = dao;
    }


    @Override
    public List<Student> findAllStudents() {
            return dao.findAllStudents();
    }

    @Override
    public Student save(Student s) {
        return dao.save(s);
    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return dao.update(s);
    }

    @Override
    public void delete(String email) {
        dao.delete(email);
    }
}
