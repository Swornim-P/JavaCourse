package com.finalWeek;

import java.io.File;

public class deleteFile {
    public static void main(String[] args) {
        File file = new File("students.txt"); // Specify the file to delete

        if (file.delete()) {
            System.out.println("File deleted successfully: " + file.getName());
        } else {
            System.out.println("Failed to delete the file. It may not exist.");
        }
    }
}
