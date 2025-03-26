package poly.ex2;

/** 기존 문제: 코드 중복 X 3(클래스 종류)
 * 1차 해결 방안(ex1.Main2): 메서드 생성 & Method Overloading
 *  한계 : 클래스 종류별로 메서드를 새롭게 생성해야 함
 *
 * 문제의 핵심 "타입이 다르다"
 *   타입이 같고 이름만 다른 변수의 반복작업이라면 배열과 반복문으로 중복을 제거할 수 있음
 *   하지만, 지금은 타입이 달라서 배열을 사용할 수 없음
 * 2차 해결 방안(ex2.Main): 동일한 부모 클래스를 갖도록 한 후 자식 메소드 오버라이딩 활용
 */
public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        sound(dog);
        sound(cat);
        sound(cow);
    }

    private static void sound(Animal animal) {  // 부모 = 자식 : Upcasting
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // 자식이 있다면 자식 method overriding
        System.out.println("동물 소리 테스트 종료");
    }
}
