package extends1.overriding;

// Car 의 기능을 상속받는 ElectricCar
public class ElectricCar extends Car {
    @Override   // annotation
    public void move() {
        System.out.println("ElectricCar move faster");
    }
// java: method does not override or implement a method from a supertype

    public void charge(){
        System.out.println("ElectricCar charge");
    }
}
