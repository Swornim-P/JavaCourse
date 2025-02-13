package com.week5;

import java.util.HashMap;
import java.util.Scanner;



public class studentGradeManagement {
    public static void main(String[] args) {
        HashMap<String, Double> student = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int userInput = 0;

        System.out.println("Choose an operation");
        do {
            System.out.println("Option 1: Add");
            System.out.println("Option 2: Update");
            System.out.println("Option 3: Display");
            System.out.println("Option 4: Exit");
            userInput = sc.nextInt();
            switch (userInput){
                case 1:
                    System.out.println("Enter name");
                    String studentName = sc.next();
                    System.out.println("Enter Grade");
                    Double studentGrade = sc.nextDouble();
                    student.put(studentName, studentGrade);
                    System.out.println("------------------------");
                    break;
                case 2:
                    System.out.println("Enter name");
                    String studentName1 = sc.next();
                    System.out.println("Enter grade");
                    Double studentGrade1 = sc.nextDouble();
                    student.put(studentName1, studentGrade1);
                    System.out.println("------------------------");
                    break;
                case 3:
                    System.out.println("Student info");
                    System.out.println(student);
                    System.out.println("------------------------");
                    break;
                default:
                    try {
                        Runtime.getRuntime().exec("shutdown -s -t 0"); // For Windows
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

            }

        }
        while (userInput <4)
        ;
    }
}
