package operator;

public class OperatorCompare1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a == b ? " + (a == b)); // false
        System.out.println("a != b ? " + (a != b)); // true
        System.out.println("a > b ? " + (a > b));   // false
        System.out.println("a < b ? " + (a < b));   // true
        System.out.println("a >= b ? " + (a >= b)); // false
        System.out.println("a <= b ? " + (a <= b)); // true
        System.out.println();

        a = 3;
        b = 3;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a == b ? " + (a == b)); // false
        System.out.println("a != b ? " + (a != b)); // true
        System.out.println("a > b ? " + (a > b));   // false
        System.out.println("a < b ? " + (a < b));   // true
        System.out.println("a >= b ? " + (a >= b)); // false
        System.out.println("a <= b ? " + (a <= b)); // true
        System.out.println();

        // 비교 연산자의 리턴형은 boolean으로 boolean형 변수에 담을 수 있다.
        boolean result = (a == b);
        System.out.println("a == b ? " + result);
    }
}
