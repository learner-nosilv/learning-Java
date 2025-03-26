package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();             // AbstractAnimal 상속
        Bird bird = new Bird();          // AbstractAnimal, Fly 인터페이스 상속
        Chicken chicken = new Chicken(); // AbstractAnimal, Fly 인터페이스 상속

        sound(dog);
        sound(bird);
        sound(chicken);

        /**
         * 동물 소리 테스트 시작
         * Dog.강아지가 "멍멍"
         * 동물 소리 테스트 종료
         *
         * 동물 소리 테스트 시작
         * Bird.새가 "짹짹"
         * 동물 소리 테스트 종료
         *
         * 동물 소리 테스트 시작
         * Chicken.닭이 "꼬끼오"
         * 동물 소리 테스트 종료
         */

//        fly(dog); dog 는 Fly 인터페이스를 상속받지 않음
        // java: incompatible types: poly.ex6.Dog cannot be converted to poly.ex6.Fly
        fly(bird);
        fly(chicken);
        /**
         * 동물 비행 테스트 시작
         * Bird.새가 비행합니다
         * 동물 비행 테스트 종료
         *
         * 동물 비행 테스트 시작
         * Chicken.닭이 비행합니다
         * 동물 비행 테스트 종료
         */
    }

    // -- 동물 클래스가 더 많이 생겨도 변하지 않는 부분 ----------
    // sound method 가 있는 곳 > AbstractAnimal
    private static void sound(AbstractAnimal animal){    // 부모 = 자식 Upcasting
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // 자식 method overriding
        System.out.println("동물 소리 테스트 종료\n");
    }

    // fly method 가 있는 곳 > Fly Interface
    private static void fly(Fly fly){       // Upcasting
        System.out.println("동물 비행 테스트 시작");
        fly.fly(); // 자식 method overriding
        System.out.println("동물 비행 테스트 종료\n");
    }
}
