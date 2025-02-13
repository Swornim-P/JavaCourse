package com.week5;

import java.util.Scanner;

public class question3 {
    static int factorial(int num){

        if (num>1){
            return num * factorial(num-1);


        }
        else {
            return num;
        }




    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        System.out.println(factorial(userInput));

    }
}
