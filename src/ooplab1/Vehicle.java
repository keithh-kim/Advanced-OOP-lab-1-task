package ooplab1;

public abstract class Vehicle {
    //Atrributes
    protected String brand;
    protected String fuelType;
    protected int Speed;

    //Abstract methods
    protected abstract void accelerate();
    protected abstract void stop();
    protected abstract void gas();

}