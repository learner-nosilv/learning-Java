package poly.basic;

// 다운 캐스팅을 자동으로 할 수 없는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();   // Child, Parent 인스턴스 생성 & 자동 업캐스팅
        Child child1 = (Child) parent1; // 명시 다운캐스팅
        child1.childMethod();

        Parent parent2 = new Parent();  // Parent 인스턴스만 생성됨
        Child child2 = (Child) parent2; // 명시 다운캐스팅 : Child 인스턴스가 없는 문제
        child2.childMethod();
        /** RUNTIME ERROR : ClassCastException
         * Exception in thread "main" java.lang.ClassCastException:
         * class poly.basic.Parent cannot be cast to class poly.basic.Child
         * (poly.basic.Parent and poly.basic.Child are in unnamed module of loader 'app')
         * 	at poly.basic.CastingMain4.main(CastingMain4.java:11)
         */
    }
}
