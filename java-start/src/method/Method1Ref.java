package method;

public class Method1Ref {
    public static void main(String[] args) {
        // 계산 1
        int sum1 = add(1, 2);
        System.out.println("결과1 출력: " + sum1);

        // 계산 2
        int sum2 = add(10, 20);
        System.out.println("결과1 출력: " + sum2);

        // 계산 3. 실행하나 반환값을 사용하지 않는 케이스
        add(100, 200);

        // 변수가 a, b -> x, y / sum1 -> sum2 로 다를 뿐 과정이 전부 같다.
    }

    // add 메서드
    public static int add(int a, int b) {
        System.out.println(a + " + " + b + " 연산 수행");
        return a +  b;
    }
}
