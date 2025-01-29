package com.newproject_w2;

public class maxinArray {
    public static void main(String[] args) {
        int[] arr = {2,5,12,19,22,2,3,2,5,2};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }


        }
        System.out.println("Max value in Array is: " + max);

        int target = 22;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==target){
                count++;
            }

        }
        System.out.println("The count of the target value is: "+ count);



    }




}
