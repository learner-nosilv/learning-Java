package condition;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;  // 아이템 가격
        int age = 10;       // 구매자 나이
        int discount = 0;   // 할인 금액

        if (price >= 10000) {     // = 구매 가격이 만원이상이면
            discount += 1000;
            System.out.println("10000원 이상을 구매하셔서 1000원 할인됩니다.");
        } else if (age <= 10) {     // = 구매 가격이 만원미만이고 나이가 10살미만이면
            discount += 1000;
            System.out.println("어린이는 1000원 할인됩니다.");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 구매가: " + price);
        System.out.println("총 할인액: " + discount);
        System.out.println("최종 결제액: " + (price - discount));
    }
}
