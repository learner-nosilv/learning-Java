package poly.car0;

public class Driver {
    private K3Car k3Car;            // 기본값: null
    private Model3Car model3Car;

    // 차량에 타기
    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    // 차량에 타기 (구현이 추가될시 새로 추가되는 부분)
    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    // 운전 : 구현이 추가될 시 조건문 추가
    public void drive(){
        if(k3Car != null){
            System.out.println("K3자동차의 운전을 시작합니다.");
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.pressBrake();
            k3Car.offEngine();
        } else if(model3Car != null){
            System.out.println("model3Car자동차의 운전을 시작합니다.");
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.pressBrake();
            model3Car.offEngine();
        }
    }
}
