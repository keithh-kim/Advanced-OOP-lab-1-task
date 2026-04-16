package ooplab1;

public class Motorcycle extends Vehicle{
    //Overriding abstract classes in vehicle
    @Override
    public void accelerate(){
        System.out.println("A motorcycle accelerates by revving");
    }
    @Override
    public void stop(){
        System.out.println("Brakes are squeezed to stop it");
    }
    @Override
    public void gas(){
        System.out.println("Motorcyles use petrol");
    }
}
