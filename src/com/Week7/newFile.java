package com.Week7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class newFile {
    public newFile(String file) {
    }

    public static void main(String[] args) {
        try{
            FileWriter writer  =  new FileWriter("Example.txt");
            writer.write("This is the first line \n");
            writer.write("This is the second line \n");
        }
        catch(IOException e){
            System.out.println("Exception occured: "+ e.getMessage());

        }
    }

//    try{
//        File readFile = new newFile("Example1.txt");
//        Scanner Sc = new Scanner(System.in);
//
//    }
}
