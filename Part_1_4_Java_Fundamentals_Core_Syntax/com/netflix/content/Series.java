package com.netflix.content;

public class Series {
    private String title;
    private int numberOfSeasons;

    public Series(String title, int numberOfSeasons) {
        this.title = title;
        this.numberOfSeasons = numberOfSeasons;
    }

    @Override
    public String toString() {
        return "Series: " + title + " - " + numberOfSeasons + " season(s)";
    }
}