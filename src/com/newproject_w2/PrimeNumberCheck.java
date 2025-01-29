package com.newproject_w2;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        boolean isPrime = false;
        for (int i = 2; i < num; i++) {
            if (num%i == 0){
                System.out.println("Number is not prime");
                isPrime = false;
                break;
            }
            else{
                isPrime = true;
            }
        }
        if (isPrime == true){
            System.out.println("Number is prime");
        }

    }
}
