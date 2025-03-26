package poly.ex.pay3;

public class NullPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("[NullPay.pay] 유효한 결제수단이 아닙니다.");
        return false;
    }
}
