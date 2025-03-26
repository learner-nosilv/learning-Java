package poly.ex.pay0;

public class TossPay {
    public boolean pay(int amount) {
        System.out.println("[TossPay.pay] 토스페이 시스템과 연결합니다.");
        System.out.println("[TossPay.pay] "+amount+"원 결제를 시도합니다.");
        return true;
    }
}
