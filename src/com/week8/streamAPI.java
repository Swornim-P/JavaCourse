package com.week8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamAPI {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(10);


        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Even Numbers (Sorted): " + evenNumbers);
    }
}
