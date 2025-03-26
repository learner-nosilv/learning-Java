package poly.car1;

public class Driver {
    private Car car;            // 기본값: null

    // 차량에 타기
    public void setCar(Car car) {
        System.out.println("자동차에 탑승합니다: " + car);
        this.car = car;
    }

    // 차량 운행
    public void drive() {
        System.out.println("운전을 시작합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.pressBrake();
        car.offEngine();
    }
}
