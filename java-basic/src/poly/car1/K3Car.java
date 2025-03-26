package poly.car1;

public class K3Car implements Car {
    @Override
    public void startEngine(){
        System.out.println("K3Car Engine is running.");
    }

    @Override
    public void offEngine(){
        System.out.println("K3Car Engine is off.");
    }

    @Override
    public void pressAccelerator(){
        System.out.println("K3Car starts moving and gradually speeds up.");
    }

    @Override
    public void pressBrake(){
        System.out.println("K3Car slows down and finally stops.");
    }
}