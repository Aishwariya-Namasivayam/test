package com.test.refactor;

//package movierental;

/**
 * The rental class represents a customer renting a movie.
 */
public class MovieRental {

    private Movie movie;
    private int days;
    
    
	public MovieRental(Movie movie, int days) {
		this.movie = movie;
		this.days = days;
	}


	public Movie getMovie() {
		return movie;
	}


	public void setMovie(Movie movie) {
		this.movie = movie;
	}


	public int getDays() {
		return days;
	}


	public void setDays(int days) {
		this.days = days;
	}
    
    

//    public Rental(Movie movie, int daysRented) {
//        _movie = movie;
//        _daysRented = daysRented;
//    }
//
//    public int getDaysRented() {
//        return _daysRented;
//    }
//
//    public Movie getMovie() {
//        return _movie;
//    }
}
