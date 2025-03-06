package com.finalWeek;

import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {

        TreeMap<String, Integer> studentMarks = new TreeMap<>();

        studentMarks.put("Shlok", 85);
        studentMarks.put("Srijan", 92);
        studentMarks.put("Swornim", 78);
        studentMarks.put("Manandhar", 90);

        System.out.println("Student Marks (Sorted by Name):");
        for (String name : studentMarks.keySet()) {
            System.out.println(name + " -> " + studentMarks.get(name));
        }
    }
}
