package kz.galijz.springstudents.service.Impl;

import kz.galijz.springstudents.model.Student;
import kz.galijz.springstudents.repository.InMemoryStudentDAO;
import kz.galijz.springstudents.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InMemoryStudentServiceImpl implements StudentService {
    private final InMemoryStudentDAO repository;

    public InMemoryStudentServiceImpl(InMemoryStudentDAO repository) {
        this.repository = repository;
    }

    @Override
    public List<Student> findAllStudent() {
        return repository.findAllStudent();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
