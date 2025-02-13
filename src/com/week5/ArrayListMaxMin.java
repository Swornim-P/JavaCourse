package com.week5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMaxMin {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Apple");
        myList.add("Banana");
        myList.add("Carrot");
        myList.add("DragonFruit");



        Iterator<String> it = myList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
