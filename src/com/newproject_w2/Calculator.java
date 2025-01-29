package com.newproject_w2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstnum = sc.nextInt();
        System.out.println("Enter second number");
        int secondnum = sc.nextInt();
        System.out.println("Enter operator");
        String operator = sc.next();

        switch (operator){
            case "+":
                System.out.println("Result: "+(firstnum+secondnum));
                break;
            case "-":
                System.out.println("Result: "+(firstnum-secondnum));
                break;
            case "*":
                System.out.println("Result: "+ (firstnum*secondnum));
                break;
            case "/":
                System.out.println("Result: "+ (firstnum/secondnum));
                break;
            default:
                System.out.println("Invalid operator");
        }


    }
}
