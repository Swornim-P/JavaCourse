package com.Week7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class javaCrud {
    static final String URL = "jdbc:mysql://localhost:3306/employee";
    static final String USER = "root";
    static final String PASSWORD = "";

    public static void insertEmployee(Connection con, Scanner sc) {
        System.out.println("Enter ID:");
        int id = sc.nextInt();

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Department:");
        String department = sc.nextLine();

        System.out.println("Enter salary:");
        double salary = sc.nextDouble();
        sc.nextLine();

//        System.out.println("Enter hire date:");
//        String hireDate = sc.nextLine();

        String query = "INSERT INTO employees(id, name, department, salary) VALUES (?,?,?,?)";


        try{
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,id);
            ps.setString(2, name);
            ps.setString(3, department);
            ps.setDouble(4, salary);
            // write code for converting hireDate string to SQL Date type
            //ps.setDate(5, java.sql.Date.valueOf(hireDate));

            int rs = ps.executeUpdate();
            System.out.println("Employee inserted");
        }catch (Exception e){
            System.out.println("Exception: "+e.getMessage());
        }

    }

    public static void updateEmployee(Connection con, Scanner sc) throws SQLException{
        System.out.println("Enter update ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter new salary:");
        double salary=sc.nextDouble();

        String query = "UPDATE employees SET salary = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setDouble(1, salary);
        ps.setInt(2, id);

        int res = ps.executeUpdate();
        System.out.println("Employee updated");
    }

    public static void main(String[] args) {
        System.out.println("1. Create Employee:");
        System.out.println("2. Update Employee");
        System.out.println("3. Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        try{
            Connection con = DriverManager.getConnection(URL,USER,PASSWORD);

            switch (choice){
                case 1:
                    insertEmployee(con,sc);
                    break;
                case 2:
                    updateEmployee(con, sc);
                    break;
                case 3:
                    System.out.println("Exiting..");
                    return;
                default:
                    System.out.println("invalid option!");
                    break;
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}