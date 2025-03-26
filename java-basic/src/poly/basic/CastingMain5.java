package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        /**
         * parent1 호출
         * Parent.parentMethod
         * Child 인스턴스를 참조하지 않음
         */

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
        /**
         * parent2 호출
         * Parent.parentMethod
         * Child 인스턴스를 참조 중
         * Child.childMethod
         */
    }

    private static void call(Parent p){
        p.parentMethod();

        // p가 Child 형을 참조하고 있다면 = 다운 캐스팅해도 안전한 상황
        if(p instanceof Child){
            System.out.println("Child 인스턴스를 참조 중");
            ((Child) p).childMethod();  // 다운 캐스팅
        }
        else{   // p가 Child 형을 참조하고 있지 않으므로 다운 캐스팅하면 위험한 상황
            System.out.println("Child 인스턴스를 참조하지 않음");
        }
    }
}
