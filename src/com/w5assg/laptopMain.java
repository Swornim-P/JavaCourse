package com.w5assg;

public class laptopMain {
    public static void main(String[] args) {
        laptop l = new laptop("Dell", "ryzen 7", "blue", 16, 512);
        l.start();
        l.printinfo();
        l.shutDown();



    }
}

