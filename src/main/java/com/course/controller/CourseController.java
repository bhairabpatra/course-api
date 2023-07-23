package com.course.controller;
import com.course.courseentity.Course;
import com.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("course")
    public ResponseEntity<Course> createCourse(@RequestBody Course course){
        Course newCourse = courseService.createCourse(course);
        return  new ResponseEntity<>(newCourse, HttpStatus.CREATED);

    }
    @GetMapping("gelAllCourse")
    public ResponseEntity<List<Course>> getAllCourse(){
        List<Course> allCourse = courseService.getCourses();
        return  new ResponseEntity<>(allCourse, HttpStatus.OK);
    }

    @GetMapping("course/{id}")
    public ResponseEntity<Course> getCourse(@PathVariable Long id){
        Course singelCourse = courseService.getCourse(id);
        return  new ResponseEntity<>(singelCourse, HttpStatus.OK);
    }

    @PutMapping("updateCourse/{id}")
    public  ResponseEntity<Course> updateCourse(@RequestBody Course course, @PathVariable Long id){
        course.setId(id);
        Course existCourse = courseService.updateCourse(course);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }
}
