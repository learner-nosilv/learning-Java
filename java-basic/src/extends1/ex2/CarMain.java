package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar eCar = new ElectricCar();
        eCar.move();
        eCar.charge();

        GasCar gCar = new GasCar();
        gCar.move();
        gCar.fillUp();
    }
}

/**
 * Car move - 상속기능사용
 * ElectricCar charge - 자신의 기능 사용
 * Car move - 상속기능사용
 * GasCar fillUp - 자신의 기능 사용
 */