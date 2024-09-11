package com.microservice.course.controller;


import com.microservice.course.model.Course;
import com.microservice.course.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    ICourseService courseService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Course course){
        courseService.save(course);
    }

    @GetMapping("/all")
    public ResponseEntity<?> finAllCourses(){
        return ResponseEntity.ok(courseService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(Long id){
        return ResponseEntity.ok(courseService.findById(id));
    }

    @GetMapping("/search-students/{idCourse}")
    public ResponseEntity<?> findStundentByIdCourse(@PathVariable Long idCourse){
        return ResponseEntity.ok(courseService.findByStudentIdCourse(idCourse));
    }
}

