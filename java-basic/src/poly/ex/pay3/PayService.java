package poly.ex.pay3;

/** Pay 인터페이스와 구현 객체의 클라이언트
 *  기존 문제pay0 : if 문이 전부 중복 (1. 결제수단선택=객체 생성 2. 실제 결제)
 *  해결 방안pay1 : 여러종류의 Pay 객체의 부모인 Pay 객체(인터페이스)를 생성하여
 *      여러 kakaoPay.pay(amount); 문을 if 문 밖에서 result = pay.pay(amount); 한 번만 사용
 *      1. 결제 수단 선택과 2. 실제 결제 파트를 쪼갬
 *      그 후 1.을 메소드로 분리 = findPay
 *
 *  기존 문제pay1 : Pay Interface의 클라이언트인 PayService의 코드가 Closed for modification 원칙에 위배됨
 *  해결 방안pay2 : PayService (Client) 가 Pay Interface 객체에 의존하는 관계여서 수정되는 부분이 있는데
 *                  새로운 Pay 클래스가 구현될 때 수정되는 부분을 따로 추상 클래스와 메소드로 분리한다.(Dependency Injection 파트)
 *
 *  기존 문제pay2 : 유효한 pay 서비스명을 입력하지 않아 DI에서 null이 주입된 상태로 pay.pay()하면 NullPointerException 이라는 런타임오류발생
 *  해결 방안pay3 : null object pattern : 유효하지 않은 pay 서비스를 생성하기
  */

public abstract class PayService {
    public static void processPay(String option, int amount) {
        System.out.println("[PayService.processPay] 결제를 시작합니다: option=" + option + ", amount=" + amount);
        boolean result = false;
        // 1. 결제 수단 선택 - Closed for Modification & Dependency Injection
        System.out.println("[PayService.processPay] Dependency Injection: Pay pay = PayStore.findPay(option);");
        Pay pay = PayStore.findPay(option);

        // 2. 실제 결제
        result = pay.pay(amount);

        if (result) {
            System.out.println("[PayService.processPay] 결제가 성공했습니다.");
        } else {
            System.out.println("[PayService.processPay] 결제가 실패했습니다.");
        }
    }
}
