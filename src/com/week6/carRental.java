package com.week6;

import java.util.Scanner;

class AgeVerificationException extends Exception{
    public AgeVerificationException (String message){
        super (message);
    }
}
public class carRental {
    public static void verifyAge(int age) throws AgeVerificationException{
        if (age <21){
            throw new AgeVerificationException("Age must be 21 years or above");
        }
        else {
            System.out.println("Verified");
            System.out.println("You can rent cars");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int userAge = sc.nextInt();
        try{
            verifyAge(userAge);
        }catch (AgeVerificationException e){
            System.out.println("UnderAge");
        }
    }
}
