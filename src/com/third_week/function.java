package com.third_week;
public class function {
    static void calcArea(double length, double breadth){
        System.out.println("Area: " + length*breadth);
    }
    static int maxMinCalculator(int[] arr, String type){
        int min = arr[0];
        int max = arr[0];
        for (int value:arr) {
            if (value<min){
                min = value;
            }
            if (value>max){
                max = value;
            }
        }
        if(type.equals("min")){
            return min;
        }
        else {
            return max;
        }
    }
    public static void main(String[] args) {
        calcArea(4f, 5f);
        int[] arr = {2,6,1,7,9,12,34};
        int result = maxMinCalculator(arr, "min");
        int max = maxMinCalculator(arr, "max");
        System.out.println("Min value in array: " + result);
        System.out.println("Max Value in array: " + max);
    }
}
