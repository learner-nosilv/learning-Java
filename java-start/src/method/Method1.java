package method;

public class Method1 {
    public static void main(String[] args) {
        // 계산 1
        int a = 1;
        int b = 2;
        System.out.println(a + " + " + b  + " 연산 수행");
        int sum1 = a + b;
        System.out.println("결과1 출력: " + sum1);

        // 계산 2
        int x = 10;
        int y = 20;
        System.out.println(x + " + " + y  + " 연산 수행");
        int sum2 = x + y;
        System.out.println("결과1 출력: " + sum2);

        // 변수가 a, b -> x, y / sum1 -> sum2 로 다를 뿐 과정이 전부 같다.
    }
}
