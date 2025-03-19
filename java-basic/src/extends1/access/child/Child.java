package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call(){
        // 부모의 public 변수 호출가능
        publicValue = 1;
        // 부모의 protected 변수 호출가능: 다른 패키지이지만 상속관계이므로
        protectedValue = 2;
        // 부모의 default 변수 호출불가: 다른 패키지이므로
//        packagePrivateValue = 3;
        // 부모의 private 변수 당연히 호출불가
//        privateValue = 4;

        // 부모의 public 메소드 호출가능
        publicMethod();
        // 부모의 protected 메소드 호출가능: 다른 패키지이나 상속관계이므로
        protectedMethod();
        // 부모의 default 메소드 호출불가: 다른 패키지이므로
//        packagePrivateMethod();
        // 부모의 private 메소드 호출불가
//        privateMethod();

        printParent();
    }
}
