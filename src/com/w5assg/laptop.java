package com.w5assg;

public class laptop {
    String brand;
    String processor ;
    String color ;
    int RAM ;
    int storage;

    public laptop(String brand, String processor, String color, int RAM, int storage){
        this.brand = brand;
        this.processor = processor;
        this.color = color;
        this.RAM = RAM;
        this.storage = storage;
    }

    static boolean laptopOn = false;
    public  void start(){
        System.out.println("Laptop turned on");
        laptopOn = true;
    }
    public  void shutDown(){
        System.out.println("Laptop shut down");
        laptopOn = false;
    }
    public void printinfo(){
        System.out.println("Brand Name: "+ this.brand);
        System.out.println("Processor: " + this.processor);
        System.out.println("color: " + this.color);
        System.out.println("RAM: "+ this.RAM);
        System.out.println("storage: "+ this.storage);
    }

}
