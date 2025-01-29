package com.newproject_w2;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

//        for (int j = 0; j < 100; j++) {
//            System.out.println(j);
//
//        }
//        while (i<100){
//            System.out.println(i);
//            i++;


//        while (i <= 10){
//            sum = sum + i;
//            i++;
//        }
//        System.out.println(sum);
//
         // Sum of digits
        int sum = 0;

        int digit = 123456789;
        while (digit%10 != 0){
            sum = sum + digit%10;
            digit = digit/10;

        }
        System.out.println(sum);
        String password = "1234";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password");
        String userinput = sc.next();

        if (userinput == password){
            System.out.println("Validated");

        }
        else{
            while (!userinput.equals(password)) {
                System.out.println("Enter Password: ");
                String pass = sc.next();
                userinput = pass;
            }
            System.out.println("Validated");
        }

     }

}
