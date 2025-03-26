package poly.car1;

public class Sonata implements Car {
    @Override
    public void startEngine(){
        System.out.println("Sonata Engine is running.");
    }

    @Override
    public void offEngine(){
        System.out.println("Sonata Engine is off.");
    }

    @Override
    public void pressAccelerator(){
        System.out.println("Sonata starts moving and gradually speeds up.");
    }

    @Override
    public void pressBrake(){
        System.out.println("Sonata slows down and finally stops.");
    }
}