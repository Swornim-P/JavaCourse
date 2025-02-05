package com.fourth_week;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Shlok");
        names.add("Swornim");
        names.add("Rabindra");

        System.out.println(names);
        for (String name : names){
            System.out.println(name);
        }

        names.set (1, "Minrows");
        names.add(2, "Ram");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(9);
        numbers.add(5);
        int maxnum = 0;

        for (int nums : numbers){
            if (nums>maxnum){
                maxnum = nums;
            }
            System.out.println(nums);
        }
        System.out.println(maxnum);
    }




}
