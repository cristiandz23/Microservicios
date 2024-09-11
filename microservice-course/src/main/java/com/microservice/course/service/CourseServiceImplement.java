package com.microservice.course.service;

import com.microservice.course.client.StudentClient;
import com.microservice.course.dto.StudentDto;
import com.microservice.course.http.response.StudentByCourseResponse;
import com.microservice.course.model.Course;
import com.microservice.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImplement implements ICourseService{

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    StudentClient studentClient;

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public StudentByCourseResponse findByStudentIdCourse(Long idCourse) {
        //consultar el curso
        Course course = courseRepository.findById(idCourse).orElse(null);

        //Obtener los estudiantes
        List<StudentDto> studentDtoList = studentClient.findAllStudentByCourse(course.getId());


        return StudentByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentDtoList(studentDtoList)
                .build();
    }
}
