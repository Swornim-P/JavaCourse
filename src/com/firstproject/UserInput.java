package com.firstproject;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Your name is: " + name);
    }
}
