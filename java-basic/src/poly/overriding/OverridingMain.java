package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = "+child.value);
        child.method();
        System.out.println("child instanceof Parent: " + (child instanceof Parent));
        System.out.println("child instanceof Child: " + (child instanceof Child));
        System.out.println(child.getClass());   // class poly.overriding.Child
        /**
         * Child -> Child
         * value = Child
         * Child.method: Child
         * child instanceof Parent: true
         * child instanceof Child: true
         * class poly.overriding.Child
         */

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = "+parent.value);
        parent.method();
        System.out.println("parent instanceof Parent: " + (parent instanceof Parent));
        System.out.println("parent instanceof Child: " + (parent instanceof Child));
        System.out.println(parent.getClass());  // class poly.overriding.Parent
        /**
         * Parent -> Parent
         * value = Parent
         * Parent.method: Parent
         * parent instanceof Parent: true
         * parent instanceof Child: false
         * class poly.overriding.Parent
         */

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent parent2 = new Child();   // Child 생성으로 생성된 Parent 인스턴스와 직연결
        System.out.println("Parent -> Child");
        System.out.println("value = "+parent2.value);
        parent2.method();
        System.out.println("parent2 instanceof Parent: " + (parent2 instanceof Parent));
        System.out.println("parent2 instanceof Child: " + (parent2 instanceof Child));
        System.out.println(parent2.getClass()); // class poly.overriding.Child
        /**
         * Parent -> Child
         * value = Parent       // parent 변수 : 오버라이딩 X
         * Child.method: Child  // child 메소드 : 오버라이딩 O
         * parent2 instanceof Parent: true
         * parent2 instanceof Child: true
         * class poly.overriding.Child
         */
    }
}
