package com.course.service;
import com.course.courseentity.Course;
import com.course.dao.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Course getCourse(Long id) {
        Optional<Course>  course = courseRepo.findById(id);
        return course.get();
    }

    @Override
    public Course updateCourse(Course course) {
        Course existCourse = courseRepo.findById(course.getId()).get();
        existCourse.setCourse_name(course.getCourse_name());
        existCourse.setCourse_fee(course.getCourse_fee());
        existCourse.setCourse_duration(course.getCourse_duration());
        existCourse.setCourse_details(course.getCourse_details());
        Course updatedCourse = courseRepo.save(existCourse);
        return updatedCourse;

    }
}
