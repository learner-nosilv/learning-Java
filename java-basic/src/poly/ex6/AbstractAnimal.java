package poly.ex6;

public abstract class AbstractAnimal {
    public abstract void sound();  // 자식에게 메소드 오버라이딩을 강제하는 메소드
    public void move(){            // 상속을 목적으로 하는 메소드
        System.out.println("AbstractAnimal.동물이 이동합니다");
    }
}