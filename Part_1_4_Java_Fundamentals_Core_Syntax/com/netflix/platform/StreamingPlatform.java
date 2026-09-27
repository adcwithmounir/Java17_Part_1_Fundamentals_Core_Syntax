package com.netflix.platform;

import com.netflix.content.Movie;
import com.netflix.content.Series;

public class StreamingPlatform {

    public static void main(String[] args) {
        Movie movie = new Movie("Inception", 2010);
        Series series = new Series("Stranger Things", 4);

        System.out.println("=== Netflix Streaming Platform ===");
        System.out.println(movie);
        System.out.println(series);
        System.out.println("Platform is ready to stream!");
    }
}

