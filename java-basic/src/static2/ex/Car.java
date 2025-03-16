package static2.ex;

public class Car {
    private static int total;   // 클래스 변수 > Method area
    private String name;        // 인스턴스 변수 > Heap area

    Car(String name) {
        this.name = name;
        Car.total++;
        System.out.println("차량 구입, 이름: " + name);
    }

    static void showTotalCars() {
        System.out.println("구매한 차량 수: " + total);
    }
}
