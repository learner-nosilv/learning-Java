package extends1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        this(a, 0); // 나의 다른 생성자 재사용 > 걔가 super 를 가짐
//        super();    // 부모 "기본" 생성자는 생략 가능
        System.out.println("ClassB Constructor: " + a);
    }

    public ClassB(int a, int b) {
        super();    // 부모 "기본" 생성자는 생략 가능
        System.out.println("ClassB Constructor: " + a + ", " + b);
    }
}
