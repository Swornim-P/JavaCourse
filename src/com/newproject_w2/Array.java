package com.newproject_w2;

public class Array {
    public static void main(String[] args) {
        String[] bikes = {"Honda", "Yamaha", "Suzuki"};
        bikes[1]="Bajaj";
        for (int i = 0; i <=2 ; i++) {
            System.out.println(bikes[i]);

        }
        for (String bike:bikes){
            System.out.println(bike);

        }
    }
}
