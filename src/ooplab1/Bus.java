package ooplab1;

public class Bus extends Vehicle {
    //Overriding abstract classes in vehicle
    @Override
    public void accelerate(){
        System.out.println("A bus accelerates by stepping on the gas pedal");
    }
    @Override
    public void stop(){
        System.out.println("A bus stops by stepping on the brake pedal");
    }
    @Override
    public void gas() {
        System.out.println("A bus uses diesel");
    }
}
