package condition;

public class Switch3_1 {
    public static void main(String[] args) {
        int grade = 2;

        // Java 14 이상에서 만들어진 새로운 switch 문
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2, 3 -> 3000;
            default -> 500;
        };
        // 장점 1) switch 문이 값 반환을 한다
        // 장점 2) break문을 사용하지 않고 개행이 줄어 코드가 깔끔해진다
        System.out.println("발급받은 쿠폰: " + coupon);
    }
}

