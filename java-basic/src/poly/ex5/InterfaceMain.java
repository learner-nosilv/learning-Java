package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        // 인터페이스 객체는 생성불가 like 순수 추상 클래스
//        InterfaceAnimal main = new InterfaceAnimal();
        // java: poly.ex5.InterfaceAnimal is abstract; cannot be instantiated

        InterfaceAnimal[] animals = new InterfaceAnimal[]{new Cat(), new Dog(), new Cow(), new Cat(), new Dog(), new Cow()};

        for (InterfaceAnimal animal : animals) {
            sound(animal);
            move(animal);
        }
    }

    // 동물 클래스가 더 많이 생겨도 변하지 않는 부분
    private static void sound(InterfaceAnimal animal){    // 부모 = 자식 Upcasting
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // 자식 method overriding
        System.out.println("동물 소리 테스트 종료\n");
    }
    // 동물 클래스가 더 많이 생겨도 변하지 않는 부분
    private static void move(InterfaceAnimal animal) {  // 부모 = 자식 : Upcasting
        System.out.println("동물 이동 테스트 시작");
        animal.move(); // 자식이 있다면 자식 method overriding
        System.out.println("동물 이동 테스트 종료\n");
    }
}

/**
 * 동물 소리 테스트 시작
 * 야옹
 * 동물 소리 테스트 종료
 *
 * 동물 이동 테스트 시작
 * 고양이 이동
 * 동물 이동 테스트 종료
 */