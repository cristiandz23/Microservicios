package com.microservice.student.service;

import com.microservice.student.model.Student;
import com.microservice.student.repository.StudentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImplement implements IStudentService{

    @Autowired
    private StudentsRepo studentsRepo;
    @Override
    public List<Student> findAll() {
        return studentsRepo.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentsRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Student student) {
        studentsRepo.save(student);
    }

    @Override
    public List<Student> findAllByIdCourse(Long idCourse) {
        return studentsRepo.findAllByIdCourse(idCourse);
    }
}
