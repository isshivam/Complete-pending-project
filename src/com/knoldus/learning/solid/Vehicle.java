package com.knoldus.learning.solid;

//public class Vehicle {
//    public void startEngine(){
//
//    }
//
//    public static void main(String [] a){
//        Vehicle v = new Car();
//        v.startEngine();
//        Vehicle b = new BiCycle();
//        b.startEngine();
//    }
//}
//
//class Car extends EngineVehicle{
//
//}
//
//class BiCycle extends NonEngineVehicle{
//    @Override
//    public void startEngine(){
//        throw Exception("Start Engine not supported");
//    }
//}
public class Vehicle {
    public void startEngine() throws Exception {
        System.out.println("Engine started");
    }
    public static void main(String [] a) throws Exception {
        Vehicle car = new Car();
        car.startEngine();

        Vehicle truck =new Truck();
        truck.startEngine();

        Vehicle bicycle = new BiCycle();
        bicycle.startEngine();

    }
}

class Car extends EngineVehicle{
    @Override
    public void startEngine() throws Exception{
        super.startEngine();
    }
}
class Truck extends EngineVehicle{
    @Override
    public void startEngine() throws Exception{
        super.startEngine();
    }
}


class BiCycle extends NonEngineVehicle{
    @Override
    public void startEngine() throws Exception{
        throw new Exception("Start Engine not supported");
    }
}
