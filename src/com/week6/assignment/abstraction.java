package com.week6.assignment;

abstract class MobilePhone{
    String brand;
    String processor;
    String RAM;

    public void printInfo(){
        System.out.println("Brand Name: "+ brand);
        System.out.println("Processor: "+ processor);
        System.out.println("RAM: "+ RAM);
    }
    public abstract void switchOn();
}

class Samsung extends MobilePhone{
    public void switchOn(){
        System.out.println("Mobile turned on");
    }

}
public class abstraction {
    public static void main(String[] args) {
        Samsung s24 = new Samsung();
        s24.brand = "Samsung";
        s24.processor = "Snapdragon";
        s24.RAM = "12 GB";

        s24.printInfo();
        s24.switchOn();

    }
}
