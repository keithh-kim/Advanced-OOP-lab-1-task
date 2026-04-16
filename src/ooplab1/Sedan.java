package ooplab1;

public class Sedan extends Vehicle implements Automobile{
    @Override
    public void openTrunk(){
        System.out.println("Sedan trunk opens manually");
    }
    @Override
    public void toggle_aircon(){
        System.out.println("Put cold on high fans");
    }
    @Override
    public void accelerate(){
        System.out.println("A sedan can accelerate to relatively fast speeds");
    }
    //overloaded version
    public void accelerate(int speed){
        System.out.println("The sedan moves at"+ speed+ "kph!");
    }

    @Override
    public void stop(){
        System.out.println("Sedan breaks do the job well");
    }
    @Override
    public void gas(){
        System.out.println("Sedans are more fuel efficient");
    }

}
