package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);

        System.out.println("constructInit1 = " + constructInit1.value);
        System.out.println("constructInit2 = " + constructInit2.value);
        /**
         * 생성자 초기화 - 생성자로 초기화하는 final 변수
         * constructInit1 = 10
         * constructInit2 = 20
         */

        // final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println("fieldInit1 = " + fieldInit1.value);
        System.out.println("fieldInit2 = " + fieldInit2.value);
        System.out.println("fieldInit3 = " + fieldInit3.value);
        /**
         * 필드 초기화 - 이미 값이 final 로 고정되어있는 변수
         * fieldInit1 = 10
         * fieldInit2 = 10
         * fieldInit3 = 10
         */

        // 상수 접근
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
        /**
         * 상수 - 이미 값이 fial 로 고정되어있는 상수(static + final)
         * 10
         */

        System.out.println("Constant.PI = " + Constant.PI);
    }
}
