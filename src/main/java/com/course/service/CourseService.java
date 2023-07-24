package com.course.service;

import com.course.courseentity.Course;

import java.util.List;


public interface CourseService {

    public Course createCourse(Course course);

    public List<Course> getCourses();

    public Course getCourse(Long cid);

    public Course updateCourse(Course course);
}
