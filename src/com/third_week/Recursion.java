package com.third_week;

public class Recursion {
    static void fibonacci(int a){
        for (int i = 0; i <=a ; i++) {


        }

    }
    static int sum (int number){
        // add num from 1 to 10
        if (number > 0){
            return number + sum(number - 1);
        }
        else{
            return 0;
        }
    }
    static int fact(int number){
        if(number>1){
            return number * fact(number-1);
        }
        else{
            return number;
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println((fact(5)));
    }
}
