package com.course.explore.course.service;

import com.course.courseentity.Course;
import com.course.explore.course.entity.ExploreCourse;
import com.course.explore.course.exception.UserNotFoundException;

import java.util.List;


public interface ExploreCourseService {


    public ExploreCourse createCourse(ExploreCourse course);

    public ExploreCourse getCourseById(Long id) throws UserNotFoundException;

    public List<ExploreCourse> getAllCourse(ExploreCourse course);

}
