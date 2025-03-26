package poly.ex4;

/**
 * 기존 문제: 코드 중복 X 3(클래스 종류)
 * 1차 해결 방안(ex1.Main2): 메서드 생성 & Method Overloading
 * 한계 : 클래스 종류별로 메서드를 새롭게 생성해야 함
 *
 * 문제의 핵심 "타입이 다르다"
 * 타입이 같고 이름만 다른 변수의 반복작업이라면 배열과 반복문으로 중복을 제거할 수 있음
 * 하지만, 지금은 타입이 달라서 배열을 사용할 수 없음
 *
 * 2차 해결 방안(ex2.Main): 동일한 부모 클래스를 갖도록 한 후 자식 메소드 오버라이딩 활용
 *
 * 3차 해결 방안(ex2.Main2): 동일한 타입(클래스)이 되었으므로, 드디어 배열과 반복문 활용
 * 한계1: 부모 클래스의 의미없는 객체 생성에 제약걸 수 없음
 * 한계2: 실수로 자식 클래스가 메소드 오버라이딩하지 않는 경우도 감지할 수 없음
 *
 * 4차 해결 방언(ex3.Main): 부모 클래스를 abstract 클래스로 만들고, abstract 메서드 제작
 */
public class AnimalSoundMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Dog(), new Cat(), new Cow(), new Dog()};

        for (Animal animal : animals) {
            move(animal);
            sound(animal);
        }
    }

    // 변하지 않는 부분
    private static void sound(Animal animal) {  // 부모 = 자식 : Upcasting
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // 자식이 있다면 자식 method overriding
        System.out.println("동물 소리 테스트 종료\n");
    }
    // 변하지 않는 부분
    private static void move(Animal animal) {  // 부모 = 자식 : Upcasting
        System.out.println("동물 이동 테스트 시작");
        animal.move(); // 자식이 있다면 자식 method overriding
        System.out.println("동물 이동 테스트 종료\n");
    }
}
