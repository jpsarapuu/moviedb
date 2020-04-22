package com.example.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie {

    @Id
    private Long id;

    private String title;
    private int year;
    private double rating;

    @Column(length = 1024)
    private String description;

    @OneToOne
    private Category category;
}
