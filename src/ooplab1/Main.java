package ooplab1;

public class Main {
    public static void main(String[] args){
        Sedan mySedan = new Sedan();
        //Override accelerate method
        mySedan.accelerate();
        //overloaded method for accelerate
        mySedan.accelerate(50);
    }
}
