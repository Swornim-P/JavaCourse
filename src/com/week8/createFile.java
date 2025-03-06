package com.week8;

import java.io.FileWriter;


public class createFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("hello.txt");
            writer.write("Hello, this is a new file.\n");
            writer.write("This file is created using Java.\n");
            writer.close();
            System.out.println("File created and written successfully.");
        } catch (Exception e) {
            System.out.println("Exception: "+ e.getMessage());

        }
    }
}