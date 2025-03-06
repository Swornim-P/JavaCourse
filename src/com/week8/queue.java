package com.week8;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Swornim");
        queue.add("Shlok");
        queue.add("Shreejal");

        System.out.println("Queue: " + queue);

        String removedElement = queue.poll();
        System.out.println("Removed: " + removedElement);

        System.out.println("Queue after removal: " + queue);

        String frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        System.out.println("Final Queue: " + queue);
    }
}
