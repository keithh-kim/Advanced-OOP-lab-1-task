package ooplab1;

public class Sports_car extends Vehicle implements Automobile{
    @Override
    public void openTrunk(){
        System.out.println("A sports car opens the trunk electronically");
    }
    @Override
    public void toggle_aircon(){
        System.out.println("Put warm on medium fans");
    }
    @Override
    public void accelerate(){
        System.out.println("A sports car can accelerate upto very high speeds");
    }
    @Override
    public void stop(){
        System.out.println("Sports car breaks are very sharp");
    }
    @Override
    public void gas(){
        System.out.println("Sports cars tend to use a lot of fuel");
    }
}

