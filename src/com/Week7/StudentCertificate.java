package com.Week7;

import java.io.FileWriter;
import java.io.IOException;

class Student{
    String name;
    String subject;
    int practicalMarks;
    int theoryMarks;

    public Student(String name, String subject, int practicalMarks, int theoryMarks) {
        this.name = name;
        this.subject = subject;
        this.practicalMarks = practicalMarks;
        this.theoryMarks = theoryMarks;
    }

    public int getTotalMarks() {
        return practicalMarks + theoryMarks;
    }

    public String generateCertificate() {
        return "----- Certificate of Achievement -----\n" +
                "Student Name: " + name + "\n" +
                "Subject: " + subject + "\n" +
                "Practical Marks: " + practicalMarks + "\n" +
                "Theory Marks: " + theoryMarks + "\n" +
                "Total Marks: " + getTotalMarks() + "\n" +
                "--------------------------------------\n";
    }
}

public class StudentCertificate {
    public static void main(String[] args) {
        // Creating a student object
        Student student = new Student("John", "Math", 12, 20);

        // Generate the certificate content
        String certificate = student.generateCertificate();
        System.out.println(certificate);

        // Write to a file
        try (FileWriter writer = new FileWriter("certificate.txt")) {
            writer.write(certificate);
            System.out.println("Certificate saved to certificate.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}