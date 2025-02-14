package com.week6;



import java.util.ArrayList;
@FunctionalInterface
interface Operation{
    void display();
}


@FunctionalInterface
interface Calculation{
    int areaCalc(int a, int b);
}
interface MathOperation{
    int add(int l, int b);
}

public class lambdaJava {
    public static void main(String[] args) {
        ArrayList<Integer> newArr = new ArrayList<>();
        newArr.add(5);
        newArr.add(6);
        newArr.add(7);

        newArr.forEach(item -> System.out.println(item));
        newArr.forEach(item ->{

            System.out.println();
        });

        Operation op=()-> System.out.println("Display MethodCalled");
        op.display();

        Calculation cl = (a, b)-> a+b;
        int res = cl.areaCalc(3,5);
        System.out.println("Result = "+ res);


    }
}
