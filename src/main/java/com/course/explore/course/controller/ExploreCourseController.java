package com.course.explore.course.controller;
import com.course.explore.course.entity.ExploreCourse;
import com.course.explore.course.service.ExploreCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class ExploreCourseController{


    @Autowired
    private  ExploreCourseService explore;

    @PostMapping("exploreCourse")
    public ResponseEntity<ExploreCourse> createCourse(@RequestBody ExploreCourse exploreCourse){
        ExploreCourse course = explore.createCourse(exploreCourse);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }

}
