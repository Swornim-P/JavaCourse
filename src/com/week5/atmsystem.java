package com.week5;

import java.util.Scanner;

public class atmsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;

        int option = 0;
        do {
            System.out.println("option 1: Withdraw");
            System.out.println("option 2: Check Balance");

            option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("Select withdraw amount");
                    int withdrawAmt = sc.nextInt();
                    if (withdrawAmt%100 == 0 && withdrawAmt<=balance){
                        System.out.println("Krrrrrrr Chichinggg");
                        System.out.println("Amount withdrawn");
                        balance = balance-withdrawAmt;
                    }
                    else if (withdrawAmt>balance){
                        System.out.println("Not enough balance");
                    }
                    else {
                        System.out.println("not in multiple of 100");
                    }
                    break;
                case 2:
                    System.out.println(balance);
                    break;
            }
        }
        while(option<=2);
    }
}
