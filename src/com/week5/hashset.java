package com.week5;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> bikes = new HashSet<>();
        bikes.add("yamaha");
        bikes.add("Honda");
        bikes.add("Bajaj");

        Iterator<String> it = bikes.iterator();
        while (it.hasNext()){

            System.out.println(it.next());


        }


    }
}
