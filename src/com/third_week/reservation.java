package com.third_week;

public class reservation {
    static void reservationCheck (String date){
        String[] availabledates = {"2025-01-21", "2025-01-23", "2025-01-24", "2025-01-29"};
        boolean isAvailable = false;

        for (int i = 0; i < availabledates.length; i++) {
            if (date.equals(availabledates[i])){
                isAvailable = true;
                break;
            }
            else{
                isAvailable = false;
            }
        }
        if (isAvailable==true){
            System.out.println("Available");
        }
        else {
            System.out.println("Unavailable");
        }
    }

    public static void main(String[] args) {
        reservationCheck("2025-01-29");

    }
}
