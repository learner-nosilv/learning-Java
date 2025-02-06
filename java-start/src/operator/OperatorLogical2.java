package operator;

public class OperatorLogical2 {
    public static void main(String[] args) {
        int a = 15;
        // a 는 10 보다 크고 20보다 작은지 검사 -> 크"고" = AND
        boolean result = (10 < a) && (a < 20);  // a 의 위치를 이렇게 두면 쪼금 더 가독성있다.
        System.out.println("a 는 10 보다 크고 20 보다 작을까요? " + result);
    }
}
