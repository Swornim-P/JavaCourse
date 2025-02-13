package com.week5;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeDirectory {

    static HashMap<Integer, String> Employee = new HashMap<>();

    static void addEmployee(int ID, String name){
        Employee.put(ID, name);

    }
    static void searchEmployee(int id){
       if (Employee.containsKey(id)){
           System.out.println(Employee.get(id));
       }
       else {
           try {
               Runtime.getRuntime().exec("shutdown -s -t 0"); // For Windows
           } catch (Exception e) {
               e.printStackTrace();
           }
       }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int option = 0;

        do{
            System.out.println("Choose an option");
            System.out.println("Option 1: Add");
            System.out.println("Option 2: Search");

            option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("Enter ID");
                    int id = sc.nextInt();
                    System.out.println("Enter Name");
                    String name = sc.next();

                    addEmployee(id, name);
                    break;

                case 2:
                    System.out.println("Enter ID to search name");
                    int searchId = sc.nextInt();
                    searchEmployee(searchId);
                    break;

                default:
                    try {
                        Runtime.getRuntime().exec("shutdown -s -t 0"); // For Windows
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            }

        }
        while(option < 5);



    }

}
