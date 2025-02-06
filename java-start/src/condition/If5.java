package condition;

public class If5 {
    public static void main(String[] args) {
        int price = 10000;  // 아이템 가격
        int age = 10;       // 구매자 나이
        int discount = 0;   // 할인 금액

        if(price >= 10000){
            discount += 1000;
            System.out.println("10000원 이상을 구매하셔서 1000원 할인됩니다.");
        }

        if(age <= 10){
            discount += 1000;
            System.out.println("어린이는 1000원 할인됩니다.");
        }

        System.out.println("총 구매가: " + price);
        System.out.println("총 할인액: " + discount);
        System.out.println("최종 결제액: " + (price - discount) );
    }
}
