package com.week6;

import java.util.Scanner;
import java.util.TreeMap;

public class taskManagement {
    static TreeMap<Integer, String> tasks = new TreeMap<>();


    static void retreivetasks(){
        System.out.println(tasks);

    }
    static void addtask(Integer taskID, String addedTask){
        tasks.put(taskID, addedTask);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Choose an option");
        int option;
        do {
            System.out.println("Option 1: View tasks");
            System.out.println("Option2: Add Task");
            option = sc.nextInt();
            switch (option){
                case 1:
                    retreivetasks();
                case 2:
                    System.out.println("Enter task id");
                    int taskid = sc.nextInt();
                    System.out.println("Enter task name");
                    String taskname = sc.next();
                    addtask(taskid, taskname);
            }



        }
        while (option<3);


    }
}

