package com.OOP;
import org.w3c.dom.ls.LSOutput;
class Dog{
    int size;
    int age;
    String color;
    String breed;
    public void sleep(){}
    public void bark(){}
}
class Pen {
    int price;
    String color;
    String type;
    String brand;
    public void printInfo(){
        System.out.println(this.price);
        System.out.println(this.color);
        System.out.println(this.type);
        System.out.println(this.brand);
    }
}
class User{
    String name;
    int age;
    double balance;

    public void printInfo_(){
        System.out.println("Name: "+ this.name);
        System.out.println("age: "+ this.age);
        System.out.println("Balance: "+ this.balance);
    }
    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.balance);
    }

    User(String name, int age, double balance){
        this.name = name;
        this.age = age;
        this.balance = balance;
    }
}
public class newoop {
    public static void main(String[] args) {
        Dog samartha = new Dog();
        samartha.age=22;
        samartha.breed = "magar";
        samartha.size = 175;
        samartha.color = "tan";

        Dog shlok = new Dog();
        shlok.age = 22;
        shlok.breed = "newar";
        shlok.size = 175;
        shlok.color = "pale white";

        Teacher shreejal = new Teacher("Shreejal", 21, "GameDev", 5000);
//        shreejal.name = "Shreejal KC";
//        shreejal.age = 21;
//        shreejal.subject = "Game Dev";
//        shreejal.salary = 5000;

        shreejal.printInfo();
        Teacher t2 = new Teacher(shreejal);
        t2.printInfo();
            Pen p1 = new Pen();
            p1.brand = "Nataraj";
            p1.price = 10;
            p1.color = "black";
            p1.type = "ball";
            p1.printInfo();
        }
        User newUser = new User("Swornim", 20, 2000);

    }





