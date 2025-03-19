package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar eCar = new ElectricCar();
        eCar.move();

        GasCar gCar = new GasCar();
        gCar.move();

        HydrogenCar hCar = new HydrogenCar();
        hCar.move();
    }
}

/**
 * ElectricCar move faster  - Method overriding
 * Car move - 부모기능
 * Car move - 부모기능
 */