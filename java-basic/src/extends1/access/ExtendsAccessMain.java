package extends1.access;

import extends1.access.child.Child;

public class ExtendsAccessMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.call();
    }
}

/**
 * parent.publicMethod          -- 자식이 호출가능한 부모 메소드
 * parent.protectedMethod       -- 자식이 호출가능한 부모 메소드
 * == parent.printParent 시작 ==
 * publicValue: 1
 * protectedValue: 2
 * packagePrivateValue: 0
 * privateValue: 0
 * parent.publicMethod
 * parent.protectedMethod
 * parent.packagePrivateMethod
 * parent.privateMethod
 * == parent.printParent 종료 ==
 */