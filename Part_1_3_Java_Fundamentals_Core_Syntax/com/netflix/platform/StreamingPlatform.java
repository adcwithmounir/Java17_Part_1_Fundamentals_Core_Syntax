package com.netflix.platform;

public class StreamingPlatform {

    private String platformName;
    private String region;

     public static void main(String[] args) {

        if (args.length < 2) {
                System.out.println("Usage: <name> <region>");
                return;
            }

        String name   = args[0]; // "Netflix"
        String region = args[1]; // "France"

        System.out.println("Launching " + name + " in " + region);

        }
    }
