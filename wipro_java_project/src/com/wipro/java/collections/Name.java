package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Name implements Comparator<Movie1> {
    @Override
    public int compare(Movie1 o1, Movie1 o2) {
        return o1.getN().compareTo(o2.getN()); // Sort by name (ascending order)
    }

    public static void main(String[] args) {
        ArrayList<Movie1> movies = new ArrayList<>();
        movies.add(new Movie1("Interstellar", 8.6, 2014));
        movies.add(new Movie1("Inception", 8.8, 2010));
        movies.add(new Movie1("The Dark Knight", 9.0, 2008));
        movies.add(new Movie1("Memento", 8.5, 2000));

        // Sorting movies by name in ascending order
        Collections.sort(movies, new Name());

        System.out.println("Movies after sorting by name (Ascending Order):");
        for (Movie1 movie : movies) {
            System.out.println(movie.getN() + " " + movie.getY() + " " + movie.getR());
        }
    }
}
