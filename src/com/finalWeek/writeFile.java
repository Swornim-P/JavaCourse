package com.finalWeek;

import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("students.txt");
        writer.write("ID: 101, Name: Alice, Age: 20\n");
        writer.write("ID: 102, Name: Bob, Age: 22\n");
        writer.close();
        System.out.println("File created and student details written successfully.");
    }
}
