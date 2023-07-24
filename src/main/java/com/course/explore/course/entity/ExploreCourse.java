package com.course.explore.course.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "explore_course")
public class ExploreCourse {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String duration;
    private int price;
    private int disPrice;
    private int rating;
    private int rateOfDiscount;
    public int getRateOfDiscount() {
        return rateOfDiscount;
    }

    public void setRateOfDiscount(int rateOfDiscount) {
        this.rateOfDiscount = rateOfDiscount;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDisPrice() {
        return disPrice;
    }

    public void setDisPrice(int disPrice) {
        this.disPrice = disPrice;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ExploreCourse() {
    }

    public ExploreCourse(Long id, String description, String duration, int price, int disPrice, int rating, int rateOfDiscount) {
        this.id = id;
        this.description = description;
        this.duration = duration;
        this.price = price;
        this.disPrice = disPrice;
        this.rating = rating;
        this.rateOfDiscount = rateOfDiscount;
    }
}
