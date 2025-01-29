package com.newproject_w2;

import java.util.Scanner;

public class trafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the light color");
        String light = sc.next();
        String loweredlight = light.toLowerCase();

        switch (loweredlight){
            case "red":
                System.out.println("Stop");
                break;

            case "yellow":
                System.out.println("Slow Down");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Signal: Maybe you are colorblind");
        }

    }
}
