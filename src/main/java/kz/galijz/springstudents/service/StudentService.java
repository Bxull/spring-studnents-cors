package kz.galijz.springstudents.service;

import kz.galijz.springstudents.model.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


public interface StudentService {


    @GetMapping
    List<Student> findAllStudent();

    Student saveStudent(Student student);

    Student findByEmail(String email);

    Student updateStudent(Student student);

    void deleteStudent(String email);
}