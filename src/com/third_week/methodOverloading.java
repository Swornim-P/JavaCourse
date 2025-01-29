package com.third_week;

public class methodOverloading {
    static void sum(){

    }
    static void sum(int a, int b){
        System.out.println(a+b);

    }
    static void sum(double a, double b){
        System.out.println(a+b);

    }

    public static void main(String[] args) {
        sum(5, 5);
        sum(5.5, 3.5);

    }


}
