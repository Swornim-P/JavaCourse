package com.newproject_w2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int fib = 0;

        for (int i = 0; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                fib = fib+i;
            }


            System.out.println(fib);

        }

    }
}
