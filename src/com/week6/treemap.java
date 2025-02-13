package com.week6;

import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeVal = new TreeMap<>();
        treeVal.put(3, "Apple");
        treeVal.put(2, "Mango");
        treeVal.put(1, "Banana");
        TreeMap<String, String> newTree = new TreeMap<>();
        newTree.put("abc", "item 1");
        newTree.put("bcd", "item 2");
        newTree.put("wxy", "item 3");
        System.out.println(treeVal);
        System.out.println(newTree);

    }
}
