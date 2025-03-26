package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        InterfaceB b = new Child();
        Child c = new Child();

        a.methodA();        // 자식Child Method Overriding
//        a.methodB(); 부모를 통해 자동으로 자식 메서드 접근 불가 (다운 캐스팅 필요)
        a.methodCommon();   // 자식Child Method Overriding
        /**
         * Child.methodA
         * Child.methodCommon
         */

//        b.methodA(); 부모를 통해 자동으로 자식 메서드 접근 불가 (다운 캐스팅 필요)
        b.methodB();        // 자식Child Method Overriding
        b.methodCommon();   // 자식Child Method Overriding
        /**
         * Child.methodB
         * Child.methodCommon
         */

        c.methodA();        // 단순 자식 Method 호출
        c.methodB();        // 단순 자식 Method 호출
        c.methodCommon();   // 단순 자식 Method 호출
        /**
         * Child.methodA
         * Child.methodB
         * Child.methodCommon
         */
    }
}
