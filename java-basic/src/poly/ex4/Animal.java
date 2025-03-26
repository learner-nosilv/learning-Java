package poly.ex4;

// 순수 추상 클래스: 객체 생성이 안 됨 [제약] & 모든 메소드가 추상인 ALL ABSTRACT
public abstract class Animal {
    // 추상 메소드: 바디가 없고 실행이 안 됨, 자식 클래스는 반드시 오버라이딩 코드가 존재해야 함 [제약]
    public abstract void sound();
    public abstract void move();
}