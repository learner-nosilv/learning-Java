package poly.ex.pay3;

/** 1. 결제 수단의 선택
 *  기존 문제pay1 : Pay Interface의 클라이언트인 PayService의 코드가 Closed for modification 원칙에 위배됨
 *  해결 방안pay2 : PayService (Client) 가 Pay Interface 객체에 의존하는 관계여서 수정되는 부분이 있는데
 *                새로운 Pay 클래스가 구현될 때 수정되는 부분을 따로 추상 클래스와 메소드로 분리한다.(Dependency Injection 파트)
 */
public abstract class PayStore {
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            System.out.println("[PayStore.findPay] KakaoPay 객체 생성, Pay 변수에 할당하여 리턴");
            return new KakaoPay();

        } else if (option.equals("naver")) {
            System.out.println("[PayStore.findPay] NaverPay 객체 생성, Pay 변수에 할당하여 리턴");
            return new NaverPay();
            /** 페이 서비스 추가시
             * 클라이언트 코드 중에 변경되는 부분이 있음 !
             */
        } else if(option.equals("toss")) {
            System.out.println("[PayStore.findPay] TossPay 객체 생성, Pay 변수에 할당하여 리턴");
            return new TossPay();
        } else {
            return new NullPay();
        }
    }
}
