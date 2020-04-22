package com.example.model;

// For retrieving movies without description
public interface MovieDTO {

    Long getId();
    String getTitle();
    int getYear();
    double getRating();
    Category getCategory();
}
