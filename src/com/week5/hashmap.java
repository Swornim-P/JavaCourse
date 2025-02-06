package com.week5;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> newmap = new HashMap<>();

        newmap.put("nepal", 240);
        newmap.put("india", 200);
        newmap.put("china", 150);
        newmap.put("nepal", 45);

        for (Integer value:newmap.values()){
            System.out.println(value);
        }

        System.out.println(newmap);
    }

}
