package com.course.explore.course.service;

import com.course.explore.course.dao.ExploreCourseDao;
import com.course.explore.course.entity.ExploreCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExploreServiceImpl implements ExploreCourseService{

    @Autowired
    private ExploreCourseDao exploreCourseDao;


    @Override
    public ExploreCourse createCourse(ExploreCourse course) {
        int discountPrice = calculateDiscount(course);
        course.setDisPrice(discountPrice);
        return  exploreCourseDao.save(course);
    }
    public int calculateDiscount(ExploreCourse disc){
        int totalPrice = (disc.getRateOfDiscount() * disc.getPrice()) / 100;
        return (disc.getPrice() - totalPrice);
    }
}
