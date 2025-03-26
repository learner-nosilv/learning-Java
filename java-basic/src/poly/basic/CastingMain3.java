package poly.basic;

// upcasting VS downcasting
public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        // Upcasting: 묵시적 형변환 부모변수=(부모형)자식인스턴스
        Parent parent1 = (Parent) child;
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();

        /**
         * Parent.parentMethod
         * Parent.parentMethod
         */
    }

}
