package com.netflix.content;

public class StreamingContent {

     String title;
     int releaseYear = 2024;
     boolean isAvailable = true;

    public StreamingContent() {
        System.out.println("Content ready: " + title);
    }

}