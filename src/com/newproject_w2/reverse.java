package com.newproject_w2;

public class reverse {
    public static void main(String[] args) {
        int num = 12346789;
        int reversednum = 0;

        while (num %10 != 0){
            reversednum = reversednum*10 +num%10;
            num = num/10;
        }
        System.out.println(reversednum);
    }

}
