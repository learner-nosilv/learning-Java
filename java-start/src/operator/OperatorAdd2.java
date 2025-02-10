package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // 전위 증감 연산자 사용 예
        System.out.println("전위 증감 연산자 사용 예 : ");
        int a = 1;
        int b = 0;
        System.out.println("a = "+ a + ", b = " + b);

        // a = a + 1, b = a
        b = ++a;    // a를 1증가(a = 2) -> 결과 a(2) 를 b 에 대입
        System.out.println("a = "+ a + ", b = " + b);

        // 후위 증감 연산자 사용 예
        System.out.println("후위 증감 연산자 사용 예 : ");
        a = 1;
        b = 0;
        System.out.println("a = "+ a + ", b = " + b);

        // b = a, a = a + 1
        b = a++;    // a의 값(1)을 b 에 대입 -> 이후 a를 1증가(a = 2)
        System.out.println("a = "+ a + ", b = " + b);
    }
}
