package condition.ex;

public class ExchangeRateEx {
    public static void main(String[] args) {
        int dollar = 10;
        System.out.println("dollar: " + dollar);

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int rate = 1300;
            System.out.println("환전 금액은 " + (dollar * rate) + "원입니다.");
        }
    }
}
