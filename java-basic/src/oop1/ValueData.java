package oop1;

public class ValueData {
    int value;

    void add(){
        value++;
        System.out.println("숫자 1증가: value = "+value);
    }
    // static 을 안 붙이는 이유
    // static 은 객체를 생성하지 않아도 메서드를 호출한다는 설정이다
    // add 메서드는 객체를 생성한 후 사용해야하는 메서드이다
    // 따라서 static 을 붙이지 않는다.
}
