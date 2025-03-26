package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver hyemin = new Driver();

        // 차량 선택: K3Car
        hyemin.setCar(new K3Car());
        hyemin.drive();
        /**
         * 자동차에 탑승합니다: poly.car1.K3Car@3feba861
         * 운전을 시작합니다.
         * K3Car Engine is running.
         * K3Car starts moving and gradually speeds up.
         * K3Car slows down and finally stops.
         * K3Car Engine is off.
         */

        // 차량 변경: Model3Car
        hyemin.setCar(new Model3Car()); // 기존 K3Car 는 GC로 처리됨
        hyemin.drive();
        /**
         * 자동차에 탑승합니다: poly.car1.Model3Car@10f87f48
         * 운전을 시작합니다.
         * Moder3Car Engine is running.
         * Moder3Car starts moving and gradually speeds up.
         * Moder3Car slows down and finally stops.
         * Moder3Car Engine is off.
         */

        // 차량 변경: Model3Car
        hyemin.setCar(new Sonata()); // 기존 K3Car 는 GC로 처리됨
        hyemin.drive();
        /**
         * 자동차에 탑승합니다: poly.car1.Sonata@2f4d3709
         * 운전을 시작합니다.
         * Sonata Engine is running.
         * Sonata starts moving and gradually speeds up.
         * Sonata slows down and finally stops.
         * Sonata Engine is off.
         */
    }
}
