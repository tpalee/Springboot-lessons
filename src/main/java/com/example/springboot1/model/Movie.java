package com.example.springboot1.model;

import javax.persistence.*;

@Entity
@Table(name="Movies")
public class Movie {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name="movie_title", length=120)
    private String movieTitle;

    @Column(name="movie_genre", length=60)
    private String movieGenre;

    @Column(name="movie_description", length=250)
    private String movieDescription;

    @Column(name="is_rated")
    private boolean isRated;

    @Column(name="rating")
    private double rating;


    public Movie(long id, String movieTitle, String movieGenre, String movieDescription, boolean isRated, double rating) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.movieGenre = movieGenre;
        this.movieDescription = movieDescription;
        this.isRated = isRated;
        this.rating = rating;
    }

    public Movie() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public boolean isRated() {
        return isRated;
    }

    public void setRated(boolean rated) {
        isRated = rated;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
