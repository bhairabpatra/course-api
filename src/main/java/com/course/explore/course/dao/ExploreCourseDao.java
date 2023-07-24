package com.course.explore.course.dao;

import com.course.explore.course.entity.ExploreCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExploreCourseDao extends JpaRepository<ExploreCourse , Long> {
}
