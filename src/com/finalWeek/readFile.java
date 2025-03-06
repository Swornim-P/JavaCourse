package com.finalWeek;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class readFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("students.txt");
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String studentData = reader.nextLine();
            System.out.println(studentData);
        }
        reader.close();
    }
}
