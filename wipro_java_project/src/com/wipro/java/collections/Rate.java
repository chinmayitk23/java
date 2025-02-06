package com.wipro.java.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Rate implements Comparator<Movie1>{
	@Override
	public int compare(Movie1 o1, Movie1 o2) {
		
		// TODO Auto-generated method stub
		return Double.compare(o1.getR(),o2.getR());
	}
	

	public static void main(String[] args) {
		ArrayList<Movie1> movies = new ArrayList<>();
        movies.add(new Movie1("Interstellar", 8.6, 2014));
        movies.add(new Movie1("Inception", 8.8, 2010));
        movies.add(new Movie1("The Dark Knight", 9.0, 2008));
        movies.add(new Movie1("Memento", 8.5, 2000));

        // Sorting movies by rating in ascending order
        Collections.sort(movies, new Rate());

        System.out.println("Movies after sorting by rating (Ascending Order):");
        for (Movie1 movie : movies) {
            System.out.println(movie.getN() + " " + movie.getY() + " " + movie.getR());
        }
		// TODO Auto-generated method stub

	}

	

}
