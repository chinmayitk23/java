package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.Collections;
public class Movie implements Comparable<Movie> {
	private String title;
    private int year;
    private double rating;


	public Movie(String title, int year, double rating) {
		this.title = title;
        this.year = year;
        this.rating = rating;
		// TODO Auto-generated constructor stub
	}
	 public int compareTo(Movie other) {
	        return Double.compare(this.rating, other.rating);
	    }
	 public String getTitle() {
	        return title;
	    }

	    public int getYear() {
	        return year;
	    }

	    public double getRating() {
	        return rating;
	    }
	public static void main(String[] args) {
		 ArrayList<Movie> movies = new ArrayList<>();
	        movies.add(new Movie("Interstellar", 2014, 8.6));
	        movies.add(new Movie("Inception", 2010, 8.8));
	        movies.add(new Movie("The Dark Knight", 2008, 9.0));
	        Collections.sort(movies);
	        System.out.println("Movies after sorting by rating");
	        for(Movie movie : movies) {
	        	System.out.println(movie.getTitle() + " " + movie.getYear() +" " + movie.getRating());
	        }
	        
		// TODO Auto-generated method stub

	}

}
