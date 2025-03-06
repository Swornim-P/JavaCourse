package com.week6.assignment;

interface Laptop{
    String brand = "Lenovo";
    String processor = "ryzen 7";
    int Ram = 16;
    void printInfo();
}
public class Interfaces implements Laptop{
    @Override
    public void printInfo() {
        System.out.println("Brand Name: "+ brand);
        System.out.println(("processor: "+ processor));
        System.out.println(("Ram: "+ Ram));
    }
    public static void main(String[] args) {
        Interfaces Legion = new Interfaces();
        Legion.printInfo();

    }
}
