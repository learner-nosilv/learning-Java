package poly.ex3;

// 추상 클래스: 객체 생성이 안 됨 [제약]
public abstract class Animal {
    // 추상 메소드: 바디가 없고 실행이 안 됨, 자식 클래스는 반드시 오버라이딩 코드가 존재해야 함 [제약]
    public abstract void sound();

    public void move(){
        System.out.println("Animal move");
    }
}