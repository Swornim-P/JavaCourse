package com.OOP;

public class Teacher {
    String name;
    int age;
    String subject;
    int salary;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.subject);
        System.out.println(this.salary);
    }
    Teacher(String name, int age, String subject, int salary){
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.salary = salary;

        // This is parameterized constructor
    }
    Teacher(Teacher other){
        this.name = other.name;
        this.age = other.age;
        this.subject = other.subject;
    }


    // Inheritance
}
