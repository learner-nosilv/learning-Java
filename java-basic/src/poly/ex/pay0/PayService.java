package poly.ex.pay0;

// Pay 인터페이스와 구현 객체의 클라이언트
public class PayService {
    public void processPay(String option, int amount) {
        boolean result = false;
        System.out.println("[PayService.processPay] 결제를 시작합니다: option=" + option + ", amount=" + amount);
        // 1. 결제수단의 선택 + 실제 결제
        if (option.equals("kakao")) {
            System.out.println("[PayService.processPay] KakaoPay 변수에 KakaoPay 객체 생성 및 할당 & KakaoPay.pay() 실행");
            KakaoPay kakaoPay = new KakaoPay();
            result = kakaoPay.pay(amount);
        } else if (option.equals("naver")) {
            System.out.println("[PayService.processPay] NaverPay 변수에 NaverPay 객체 생성 및 할당 & NaverPay.pay() 실행");
            NaverPay naverPay = new NaverPay();
            result = naverPay.pay(amount);
            /**
             * 페이 서비스 추가시
             * 클라이언트 코드 중에 변경되는 부분이 있음 !
             */
        } else if(option.equals("toss")) {
            System.out.println("[PayService.processPay] TossPay 변수에 TossPay 객체 생성 및 할당 & TossPay.pay() 실행");
            TossPay tossPay = new TossPay();
            result = tossPay.pay(amount);
        } else {
            System.out.println("[PayService.processPay] 결제 수단이 없습니다.");
        }

        if (result) {
            System.out.println("[PayService.processPay] 결제가 성공했습니다.");
        } else {
            System.out.println("[PayService.processPay] 결제가 실패했습니다.");
        }
    }
}
