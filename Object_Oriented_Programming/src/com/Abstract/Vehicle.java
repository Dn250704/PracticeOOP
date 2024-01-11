package com.Abstract;

public abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car is starting...");
    }
}

class Motorcycle extends Vehicle{

    @Override
    void start() {
        System.out.println("Motorcycle is starting...");
    }
}

class Ex8 {
    public static void startVehicle(Vehicle transfer) {
        transfer.start();
    }
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motor = new Motorcycle();
        startVehicle(car);
        startVehicle(motor);
    }
}
