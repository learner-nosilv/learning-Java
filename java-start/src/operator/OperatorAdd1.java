package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("a = " + a);

        a = a + 1; // 1 증가
        System.out.println("a = a + 1 = " + a);

        a = a + 1; // 1 증가
        System.out.println("a = a + 1 = " + a);

        // 증감 연산자(increment and Decrement Operators)
        ++a;    // a = a + 1
        System.out.println("++a = " + a);
        ++a;    // a = a + 1
        System.out.println("++a = " + a);

        --a;    // a = a - 1
        System.out.println("--a = " + a);

    }
}
