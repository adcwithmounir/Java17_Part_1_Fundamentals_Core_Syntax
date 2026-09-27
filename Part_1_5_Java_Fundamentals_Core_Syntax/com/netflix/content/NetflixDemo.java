package com.netflix.content;

public class NetflixDemo {
    public static void main(String[] args) {

        StreamingContent movie1 = new StreamingContent();
        movie1.title = "Squid Game";
        movie1.releaseYear = 2021;

        StreamingContent movie2 = new StreamingContent();
        movie2.title = "Money Heist";

        System.out.println(movie1.title);
        System.out.println(movie2.title);
        System.out.println(movie2.releaseYear);
    }
}
