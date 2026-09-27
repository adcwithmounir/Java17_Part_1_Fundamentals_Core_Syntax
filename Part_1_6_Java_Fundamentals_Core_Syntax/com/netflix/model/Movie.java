package com.netflix.model;

public class Movie {

    // Reference types (instance variables — default: null)
    private String title;
    private String genre;

    // Primitive types (instance variables — default: 0 / false)
    private int    releaseYear;
    private double rating;
    private float  storageSizeGB;
    private long   totalViews;
    private boolean isAvailable;

    // Method using var (local variable)
    public void printSummary() {
        var label = title + " (" + releaseYear + ")";
        var stars = rating >= 8.0 ? "Top Rated" : "Standard";
        System.out.println(label + " — " + stars);
        System.out.println("Views: " + totalViews);
    }

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.title = "Stranger Things";
        movie.genre = "Sci-Fi";
        movie.releaseYear = 2016;
        movie.rating = 9.3;
        movie.storageSizeGB = 4.2f;
        movie.totalViews = 1_500_000_000L;
        movie.isAvailable = true;
        movie.printSummary();
    }


}
