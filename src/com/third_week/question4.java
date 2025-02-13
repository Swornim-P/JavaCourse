package com.third_week;

import com.firstproject.SwitchCondition;

import java.util.HashMap;
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        HashMap<Integer, String> seats = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        int option = 0;

        do {

            System.out.println("Choose an option");
            System.out.println("Option 1: Book seat");
            System.out.println("Option 2: Check seats");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter seat no");
                    int seatNo = sc.nextInt();
                    if (seatNo < 10 && seats.isEmpty()) {

                        seats.put(seatNo, "booked");
                        System.out.println("Seat"+seatNo+"Booked");

                    } else if (seatNo>=10) {
                        System.out.println("only 10 seats available");

                    } else {
                        System.out.println("Seat already booked");
                    }
                    break;

                case 2:
                    System.out.println(seats);
                    break;


            }


        }
        while (option < 3);
    }
}