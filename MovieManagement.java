package com.chetu.movieReviewSystem.entities;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Movie_Management")
public class MovieManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

}
