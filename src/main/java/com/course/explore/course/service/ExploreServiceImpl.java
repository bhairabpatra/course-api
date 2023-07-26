package com.course.explore.course.service;

import com.course.courseentity.Course;
import com.course.explore.course.dao.ExploreCourseDao;
import com.course.explore.course.entity.ExploreCourse;
import com.course.explore.course.exception.NoHandlerFoundException;
import com.course.explore.course.exception.UserNotFoundException;
import com.course.explore.course.exception.handelNoCourseFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExploreServiceImpl implements ExploreCourseService {

    @Autowired
    private ExploreCourseDao exploreCourseDao;

    @Override
    public ExploreCourse createCourse(ExploreCourse course) {
        int discountPrice = calculateDiscount(course);
        course.setDisPrice(discountPrice);
        return exploreCourseDao.save(course);
    }

    @Override
    public ExploreCourse getCourseById(Long id) throws UserNotFoundException {
        Optional<ExploreCourse> course = exploreCourseDao.findById(id);
        if (course.isPresent()) {
            return course.get();

        } else {
            throw new UserNotFoundException("Course not found with Id - " + id);
        }
    }

    @Override
    public List<ExploreCourse> getAllCourse(ExploreCourse course) {
        List<ExploreCourse> allCourse = exploreCourseDao.findAll();
//        allCourse.clear();
        if (allCourse.isEmpty()) {
            throw new handelNoCourseFound("No course Found");
        }
        return exploreCourseDao.findAll();
    }

    public int calculateDiscount(ExploreCourse disc) {
        int totalPrice = (disc.getRateOfDiscount() * disc.getPrice()) / 100;
        return (disc.getPrice() - totalPrice);
    }

}
