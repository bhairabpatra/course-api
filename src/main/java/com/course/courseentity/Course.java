package com.course.courseentity;
import jakarta.persistence.*;

@Entity
@Table(name = "course_tbl")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String course_name;

    private String course_fee;
    private String course_duration;
    private Long course_details;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCourse_name() {
        return course_name;
    }
    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
    public String getCourse_fee() {
        return course_fee;
    }

    public void setCourse_fee(String course_fee) {
        this.course_fee = course_fee;
    }

    public String getCourse_duration() {
        return course_duration;
    }

    public void setCourse_duration(String course_duration) {
        this.course_duration = course_duration;
    }

    public Long getCourse_details() {
        return course_details;
    }

    public void setCourse_details(Long course_details) {
        this.course_details = course_details;
    }

    public Course() {
    }
    public Course(Long id, String course_name, String course_fee, String course_duration, Long course_details) {
        this.id = id;
        this.course_name = course_name;
        this.course_fee = course_fee;
        this.course_duration = course_duration;
        this.course_details = course_details;
    }

}
