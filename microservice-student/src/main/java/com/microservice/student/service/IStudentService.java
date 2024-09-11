package com.microservice.student.service;


import com.microservice.student.model.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();

    Student findById(Long id);

    void save(Student student);

    List<Student> findAllByIdCourse(Long idCourse);
}
