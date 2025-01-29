package com.firstproject;

import java.util.Scanner;

public class JavaCondition {
    public static void main(String[] args) {
        // Check given number odd or even
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int number = sc.nextInt();
//
//        if (number%2 == 0)
//        {
//            System.out.println("The number is even");
//
//
//        }
//        else
//        {
//            System.out.println("The number is odd");
//        }
//
//        // Check if the number is positive or negative
//        System.out.println("Enter the number: ");
//        int num = sc.nextInt();
//        if (num > 0){
//            System.out.println("The number is positive");
//        } else if (num<0) {
//            System.out.println("The number is negative");
//
//        }else {
//            System.out.println("The number is zero");
//        }
//        System.out.println("Enter the day in number");
//        int num = sc.nextInt();
//        if (num == 1){
//            System.out.println("Sunday");
//        } else if (num ==2) {
//            System.out.println("Monday");
//
//        } else if (num == 3) {
//            System.out.println("Tuesday");
//
//        } else if (num == 4) {
//            System.out.println("Wednesday");
//
//        } else if (num == 5) {
//            System.out.println("Thursday");
//        } else if (num == 6) {
//            System.out.println("Friday");
//
//        } else if (num == 7) {
//            System.out.println("Saturday");
//        }
//        else{
//            System.out.println("Not my day");
//        }

//        String username = "swornimp123@gmail.com";
//        String password = "12345678";
//        System.out.println("Enter your user id");
//
//
//        String user = sc.next();
//        System.out.println("Enter password");
//        String pass = sc.next();
//
//        if (user.equals(username) && pass.equals(password)){
//            System.out.println("Authentication successful");
//        }
//        else {
//            System.out.println("Incorrect username of password");
//        }

//        System.out.println("Enter your grade: ");
//        float grade = sc.nextInt();
//
//        if (grade>=90 && grade <= 100){
//            System.out.println("A");
//
//        } else if (grade >=80 && grade <90) {
//            System.out.println("B");
//
//        }else if(grade >=70 && grade <80){
//            System.out.println("C");
//        } else if (grade>=60 && grade <70) {
//            System.out.println("D");
//
//
//        }else if (grade < 1 || grade > 100){
//            System.out.println("Invalid grade");
//        }
//        else {
//            System.out.println("You have failed moron");
//        }

        System.out.println("Whats the price? : ");
        float price = sc.nextFloat();
        if (price >= 1000){
            System.out.println("Discount: 30%");
            System.out.println("Final Price: "+ (price - (0.3*price)));
        } else if (price>=400 && price < 1000) {
            System.out.println("Discount: 20%");
            System.out.println("Final Price: "+ (price - (0.2 * price)));

        } else if (price >= 200 && price <400) {
            System.out.println("Discount: 20%");
            System.out.println("Final Price: "+ (price - ( 0.1 * price)));


        }else {
            System.out.println("No discount applicable");


        }
    }
}
