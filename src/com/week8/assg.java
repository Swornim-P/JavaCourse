package com.week8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class assg {
    static final String URL = "jdbc:mysql://localhost:3306/students";
    static final String USER = "root";
    static final String PASSWORD = "";

    public static void insertStudent(Connection con, Scanner sc){
        System.out.println("Enter ID");
        int id = sc.nextInt();
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter grade");
        int grade = sc.nextInt();
        System.out.println("Enter fees");
        double fees = sc.nextDouble();

        String query = "INSERT INTO student(id, name, grade, fees) VALUES (?,?,?,?)";

        try{
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, grade);
            ps.setDouble(4, fees);

            int rs = ps.executeUpdate();
            System.out.println("Student Inserted");

        } catch (SQLException e) {
            throw new RuntimeException(e);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Connection con = DriverManager.getConnection(URL,USER,PASSWORD);

            insertStudent(con, sc);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
