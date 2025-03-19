package extends1.ex3;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar eCar = new ElectricCar();
        eCar.move();
        eCar.openDoor();
        eCar.charge();

        GasCar gCar = new GasCar();
        gCar.move();
        gCar.openDoor();
        gCar.fillUp();

        HydrogenCar hCar = new HydrogenCar();
        hCar.move();
        hCar.openDoor();
        hCar.fillHydrogen();

    }
}

/**
 * Car move         -- 부모기능
 * Car open door    -- 부모기능
 * ElectricCar charge   -- 자신기능
 * Car move         -- 부모기능
 * Car open door    -- 부모기능
 * GasCar fillUp    -- 자신기능
 * Car move         -- 부모기능
 * Car open door    -- 자신기능
 * Hydrogen Car fills Hydrogen  -- 자신기능
 */