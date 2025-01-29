package com.newproject_w2;

public class ReverseString {
    public static void main(String[] args) {
        String toReverse = "JavaProgramming";
        String reversed = "";

        for (int i = (toReverse.length()-1); i >= 0; i--) {

            reversed = reversed + toReverse.charAt(i);



        }
        System.out.println(reversed);
    }
}
