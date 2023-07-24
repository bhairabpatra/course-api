package com.course.courseentity;

import jakarta.persistence.*;

@Entity
@Table(name = "course_tbl")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String course_name;

    private Long course_fee;
    private String course_duration;
    private String course_details;
    private String class_type;
    private Boolean preview;
    private int rating;


    public String getClass_type() {
        return class_type;
    }

    public void setClass_type(String class_type) {
        this.class_type = class_type;
    }



    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }



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

    public Long getCourse_fee() {
        return course_fee;
    }

    public void setCourse_fee(Long course_fee) {
        this.course_fee = course_fee;
    }

    public String getCourse_duration() {
        return course_duration;
    }

    public void setCourse_duration(String course_duration) {
        this.course_duration = course_duration;
    }

    public String getCourse_details() {
        return course_details;
    }

    public void setCourse_details(String course_details) {
        this.course_details = course_details;
    }

    public Boolean getPreview() {
        return preview;
    }

    public void setPreview(Boolean preview) {
        this.preview = preview;
    }

    public Course(Long id, String course_name, Long course_fee, String course_duration, String course_details, String class_type, Boolean preview, int rating) {
        this.id = id;
        this.course_name = course_name;
        this.course_fee = course_fee;
        this.course_duration = course_duration;
        this.course_details = course_details;
        this.class_type = class_type;
        this.preview = preview;
        this.rating = rating;
    }

    public Course() {
    }



}
