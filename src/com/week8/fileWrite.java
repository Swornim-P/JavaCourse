package com.week8;

import java.io.FileWriter;


public class fileWrite {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("hello.txt", true);
            writer.write("This is a new line added to the file.\n");
            writer.close();
            System.out.println("New content appended successfully.");
        } catch (Exception e) {
            System.out.println("Exception: "+ e.getMessage());

        }
    }
}