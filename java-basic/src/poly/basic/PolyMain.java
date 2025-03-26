package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스에 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();
        /**
         * Parent -> Parent
         * Parent.parentMethod
         */

        // 자식 변수가 자식 인스턴스에 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.childMethod();
        child.parentMethod();
        /**
         * Child -> Child
         * Child.childMethod
         * Parent.parentMethod
         */

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        // 원래라면 부모 인스턴스는 자식을 모르지만, 지금은 명시적으로 연결해줌
        poly.parentMethod();

        // 자식 변수는 부모 인스턴스를 담을 수 없다
//        Child polyChild = new Parent();
        // java: incompatible types: poly.basic.Parent cannot be converted to poly.basic.Child
    }
}
