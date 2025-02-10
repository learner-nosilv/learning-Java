package condition.ex;

public class BiggerEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b;
        System.out.println("a(" + a + ")와 b(" + b + ") 중에서 더 큰 숫자는 " + max + "입니다.");
    }
}
// 삼항 연산자를 사용하는 문제