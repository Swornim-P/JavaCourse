package com.firstproject;
// Typecasting -- changing variable type
// int -- 4 bytes, double -- 8 bytes
public class TypeCast {
    public static void main(String[] args) {
        // Implicit: Done automatically by java;
        int tax = 13;
        double price = 100.02 + tax;
        System.out.println(price);

        // Explicit: Manually do ;
        double newTax = 13.89;
        int newPrice = 100 + (int)newTax;
        System.out.println(newPrice);

        float pi = 3.14f; // Variable
        pi = 45.56f;


        final float PI = 3.14f; //constant
        //pi = 45.56;


    }
}
