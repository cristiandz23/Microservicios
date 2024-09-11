package com.microservice.course.service;


import com.microservice.course.http.response.StudentByCourseResponse;
import com.microservice.course.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ICourseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    StudentByCourseResponse findByStudentIdCourse(Long idCourse);

}
