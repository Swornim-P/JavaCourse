package com.week5;

import java.util.LinkedList;
import java.util.Scanner;

public class taskManager {
    static LinkedList<String> tasks = new LinkedList<>();
    static void addTask(String addedtask){
        tasks.add(addedtask);
    }
    static void removeTask(String removedtask){
        tasks.remove(removedtask);

    }
    static void displayTasks(){
        System.out.println(tasks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;

        do{
            System.out.println("========================");
            System.out.println("Choose an option");
            System.out.println("Option 1: Add Task");

            System.out.println("Option 2: Remvoe Task");
            System.out.println("Option 3: View Task");

            option = sc.nextInt();
            switch (option){

                case 1:
                    System.out.println("Enter task to add");
                    String taskToAdd = sc.next();
                    addTask(taskToAdd);
                    System.out.println("Task Added");
                    break;
                case 2:
                    System.out.println("Enter task to remove");
                    String taskToRemove = sc.next();
                    removeTask(taskToRemove);
                    System.out.println("Task Removed");
                    break;

                case 3:
                    displayTasks();
                    break;

            }
        }
        while(option<4);



    }
}
