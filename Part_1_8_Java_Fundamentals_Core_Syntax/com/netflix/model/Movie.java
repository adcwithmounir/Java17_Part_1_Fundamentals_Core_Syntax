package com.netflix.model;

public class Movie {

    String title;        // → null
    double rating;       // → 0.0
    int    views;        // → 0
    boolean available;   // → false

    public void displayInfo() {
        String label = "Now Showing";
        System.out.println(label + ": " + label);
    }

    public static void main(String[] args) {
        Movie movie = new Movie();
        System.out.println("--- Default Instance Variable Values ---");
        System.out.println("Title   : " + movie.title);
        System.out.println("Rating  : " + movie.rating);
        System.out.println("Views   : " + movie.views);
        System.out.println("Available: " + movie.available);
        System.out.println("--- Calling displayInfo ---");
        movie.displayInfo();
    }




}