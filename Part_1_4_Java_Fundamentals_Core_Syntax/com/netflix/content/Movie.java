package com.netflix.content;

public class Movie {
    private String title;
    private int releaseYear;

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "Movie: " + title + " (" + releaseYear + ")";
    }
}

