package poly.ex.pay2;

public class NaverPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("[NaverPay.pay] 네이버페이 시스템과 연결합니다.");
        System.out.println("[NaverPay.pay] "+amount+"원 결제를 시도합니다.");
        return true;
    }
}
