package com.knoldus.learning.solidExample;
//applying solid-principle
class Main{
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        Vehicle bycycle =new Bycycle();
        bycycle.start();
    }
}

public interface Vehicle {
    public abstract void start();
}

//For engine vehicles
 interface EngineVehicle extends Vehicle{
    void start();
}

//For non engine vehicle
interface NonEngineVehicle extends Vehicle{
    void start();
}

class Car implements EngineVehicle{
    @Override
    public void start() {
        System.out.println("Engine Started");
    }
}

class Bycycle implements NonEngineVehicle{

    @Override
    public void start() {
        System.out.println("Cycle is running");
    }
}