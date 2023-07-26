package com.course.explore.course.controller;

import com.course.explore.course.entity.ExploreCourse;
import com.course.explore.course.exception.UserNotFoundException;
import com.course.explore.course.service.ExploreCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ExploreCourseController {


    @Autowired
    private ExploreCourseService explore;

    @PostMapping("exploreCourse")
    public ResponseEntity<ExploreCourse> createCourse(@RequestBody ExploreCourse exploreCourse) {
        try {
            ExploreCourse course = explore.createCourse(exploreCourse);
            return new ResponseEntity<>(course, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("exploreCourse/{id}")
    public ResponseEntity<ExploreCourse> getCourseById(@PathVariable Long id) throws UserNotFoundException {
        ExploreCourse existUser = explore.getCourseById(id);
        return new ResponseEntity<>(existUser, HttpStatus.OK);
    }

    @GetMapping("getExploreCourse")
    public ResponseEntity<List<ExploreCourse>> getExploreCourse(ExploreCourse course) {
        List<ExploreCourse> allCourse = explore.getAllCourse(course);
        return new ResponseEntity<>(allCourse, HttpStatus.OK);
    }
}
