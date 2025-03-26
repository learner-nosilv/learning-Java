package poly.ex2;

/**
 * 기존 문제: 코드 중복 X 3(클래스 종류)
 * 1차 해결 방안(ex1.Main2): 메서드 생성 & Method Overloading
 * 한계 : 클래스 종류별로 메서드를 새롭게 생성해야 함
 * <p>
 * 문제의 핵심 "타입이 다르다"
 * 타입이 같고 이름만 다른 변수의 반복작업이라면 배열과 반복문으로 중복을 제거할 수 있음
 * 하지만, 지금은 타입이 달라서 배열을 사용할 수 없음
 * <p>
 * 2차 해결 방안(ex2.Main): 동일한 부모 클래스를 갖도록 한 후 자식 메소드 오버라이딩 활용
 * <p>
 * 3차 해결 방안(ex2.Main2): 동일한 타입(클래스)이 되었으므로, 드디어 배열과 반복문 활용
 */
public class AnimalSoundMain2 {
    public static void main(String[] args) {
        // 부모 = 자식 : Upcasting
        Animal[] animals = new Animal[]{new Dog(), new Cat(), new Cow(), new Duck(), new Dog()};

        for (Animal animal : animals) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound(); // 자식이 있다면 자식 method overriding
            System.out.println("동물 소리 테스트 종료\n");
        }
    }
}
