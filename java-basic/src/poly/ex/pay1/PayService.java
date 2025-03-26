package poly.ex.pay1;

/** Pay 인터페이스와 구현 객체의 클라이언트
 *  기존 문제 : if 문이 전부 중복 (1. 결제수단선택=객체 생성 2. 실제 결제)
 *  해결 방안 : 여러종류의 Pay 객체의 부모인 Pay 객체(인터페이스)를 생성하여
 *      여러 kakaoPay.pay(amount); 문을 if 문 밖에서 result = pay.pay(amount); 한 번만 사용
 *      1. 결제 수단 선택과 2. 실제 결제 파트를 쪼갬
 *      그 후 1.을 메소드로 분리 = findPay
  */


public class PayService {
    public void processPay(String option, int amount) {
        System.out.println("[PayService.processPay] 결제를 시작합니다: option=" + option + ", amount=" + amount);
        boolean result = false;
        // 1. 결제 수단 선택
        Pay pay = findPay(option);

        // 2. 실제 결제
        result = pay.pay(amount);

        if (result) {
            System.out.println("[PayService.processPay] 결제가 성공했습니다.");
        } else {
            System.out.println("[PayService.processPay] 결제가 실패했습니다.");
        }
    }

    // 1. 결제 수단의 선택
    private Pay findPay(String option) {
        Pay pay;

        if (option.equals("kakao")) {
            System.out.println("[PayService.findPay] Pay 변수에 KakaoPay 객체 생성 및 할당");
            return new KakaoPay();

        } else if (option.equals("naver")) {
            System.out.println("[PayService.findPay] Pay 변수에 NaverPay 객체 생성 및 할당");
            return new NaverPay();
            /** 페이 서비스 추가시
             * 클라이언트 코드 중에 변경되는 부분이 있음 !
             */
        } else if(option.equals("toss")) {
            System.out.println("[PayService.findPay] Pay 변수에 TossPay 객체 생성 및 할당");
            return new TossPay();
        } else {
            System.out.println("[PayService.findPay] 결제 수단이 없습니다.");
            return null;
        }
    }
}
