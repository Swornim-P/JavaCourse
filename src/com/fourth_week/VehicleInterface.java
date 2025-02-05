package com.fourth_week;

interface Vehiclemgmt{
    void start();
    void stop();
}
class Car implements Vehiclemgmt {
    @Override
    public void start() {
        System.out.println("Car engine started");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped");
    }
}

class Bike implements Vehiclemgmt {
    @Override
    public void start() {
        System.out.println("Bike engine started");
    }

    @Override
    public void stop() {
        System.out.println("Bike engine stopped");
    }
}
public class VehicleInterface {
    public static void main(String[] args) {
        Vehiclemgmt car = new Car();
        Vehiclemgmt bike = new Bike();

        car.start();
        car.stop();
        bike.start();
        bike.stop();
    }
}
