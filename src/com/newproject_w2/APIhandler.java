package com.newproject_w2;

import java.util.Scanner;

public class APIhandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats the code?");
        int apinum = sc.nextInt();

        switch (apinum){
            case 200:
                System.out.println("OK");
                break;
            case 404:
                System.out.println("Not Found");
                break;
            case 500:
                System.out.println("Internal Server Error");
                break;
            default:
                System.out.println("Unknown status");



        }
    }
}
