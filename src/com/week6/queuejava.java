package com.week6;

import java.util.LinkedList;
import java.util.Queue;

public class queuejava {
    public static void main(String[] args) {
        Queue<String> queVal = new LinkedList<>();
        queVal.add("item1");
        queVal.add("item2");
        queVal.add("item3");

        System.out.println(queVal);
        System.out.println("remove element"+queVal.poll());
        System.out.println("queue after = "+ queVal);
    }
}
