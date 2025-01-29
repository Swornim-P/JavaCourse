package com.third_week;

public class breakuses {
    public static void main(String[] args) {
        for (int i = 0; i <=10 ; i++) {
            if (i==5){
                break;
            }
            System.out.println(i);


        }
        for (int i = 10; i <= 20 ; i++) {
            if (i%2 == 0){
                continue;
            }
            System.out.println(i);

        }
    }
}
