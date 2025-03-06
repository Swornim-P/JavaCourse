package com.Week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamapi {
    public static void main(String[] args) {
        List<Integer> newList = Arrays.asList(1,2,3,4,5,6);

        List<Integer> evenList=new ArrayList<>();

        for(Integer list:newList){
            if (list%2==0){
                evenList.add(list);
            }
        }
        // stream API
        List<Integer> newEvenList= newList.stream().filter(i->i%2==0).collect(Collectors.toList());

        List<Integer> squareList= newList.stream().map(i->i*i).collect(Collectors.toList());

        int max=newList.stream().max((x,y)->x.compareTo(y)).get();

        // sort
        List<Integer> sortedList=newList.stream().sorted().collect(Collectors.toList());

        System.out.println(newEvenList);
        System.out.println(squareList);
        System.out.println("Max number="+max);
        System.out.println(sortedList);

        // factorial calculate using stream API
    }
}