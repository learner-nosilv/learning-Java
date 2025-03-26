package poly.ex.pay3;

public class KakaoPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("[KakaoPay.pay] 카카오페이 시스템과 연결합니다.");
        System.out.println("[KakaoPay.pay] " + amount+"원 결제를 시도합니다.");
        return true;
    }
}
