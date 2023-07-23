package com.course.service;
import com.course.courseentity.Course;
import com.course.dao.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRepo courseRepo;

    @Override
    public Course createCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public List<Course> getCourses() {
        return courseRepo.findAll();
    }
}
