package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver hyemin = new Driver();
        K3Car hyeminFirstCar = new K3Car();
        hyemin.setK3Car(hyeminFirstCar);
        hyemin.drive();
        /**
         * K3자동차의 운전을 시작합니다.
         * K3Car Engine is running.
         * K3Car starts moving and gradually speeds up.
         * K3Car slows down and finally stops.
         * K3Car Engine is off.
         */

        // 추가: Moder3Car 탑승
        Model3Car hyeminSecondCar = new Model3Car();
        hyemin.setK3Car(null);                  // 탑승해제
        hyemin.setModel3Car(hyeminSecondCar);   // 탑승
        hyemin.drive();
        /**
         * model3Car자동차의 운전을 시작합니다.
         * Moder3Car Engine is running.
         * Moder3Car starts moving and gradually speeds up.
         * Moder3Car slows down and finally stops.
         * Moder3Car Engine is off.
         */
    }
}
