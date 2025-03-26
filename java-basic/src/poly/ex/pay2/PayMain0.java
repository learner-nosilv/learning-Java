package poly.ex.pay2;

import java.util.Scanner;

public class PayMain0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 1. 결제수단입력
            System.out.print("[Main] 결제 수단을 입력하세요: ");
            String payOption = sc.nextLine();

            // 종료조건
            if(payOption.equals("exit")) {
                System.out.println("[Main] 프로그램을 종료합니다.");
                return;
            }

            // 2. 금액입력
            System.out.print("[Main] 결제 금액을 입력하세요: ");
            int amount = sc.nextInt();
            sc.nextLine();

            // 3. 페이서비스 실행
            System.out.println("[Main] PayService.processPay 실행");
            PayService.processPay(payOption, amount);
            System.out.println("[Main] PayService.processPay 종료");
        }
    }
}

/**
 * 페이 서비스: 2개 에서 확장가능성 > 인터페이스 필요
 * 페이 서비스 인터페이스를 사용하는 클라이언트: PayService
 *
 * 0. 구현(페이서비스) 확장 시 클라이언트(PayService)의 코드가 변경되는 상황 & Dependency Injection 을 사용하지 않는 상황
 * [Main] 결제 수단을 입력하세요: naver
 * [Main] 결제 금액을 입력하세요: 10000
 * [Main] payService.processPay 실행
 * [PayService.processPay] 결제를 시작합니다: option=naver, amount=10000
 * [PayService.processPay] NaverPay 변수에 NaverPay 객체 생성 및 할당 & NaverPay.pay() 실행
 * [NaverPay.pay] 네이버페이 시스템과 연결합니다.
 * [NaverPay.pay] 10000원 결제를 시도합니다.
 * [PayService.processPay] 결제가 성공했습니다.
 * [Main] payService.processPay 종료
 *
 * 1. 코드가 변경되는 부분을 메소드로 분리 : if 문 속의 1. 결제수단선택=객체 생성(변하는 부분) / 2. 실제 결제
 * [Main] 결제 수단을 입력하세요: toss
 * [Main] 결제 금액을 입력하세요: 1000
 * [Main] payService.processPay 실행
 * [PayService.processPay] 결제를 시작합니다: option=toss, amount=1000
 * [PayService.findPay] Pay 변수에 TossPay 객체 생성 및 할당
 * [TossPay.pay] 토스페이 시스템과 연결합니다.
 * [TossPay.pay] 1000원 결제를 시도합니다.
 * [PayService.processPay] 결제가 성공했습니다.
 * [Main] payService.processPay 종료
 *
 * 2. 메소드로 분리된 코드 변경 구간을 PayStore 클래스의 정적 메소드findPay()로 더 분리 > OCP 지킴 + Dependency Injection
 * [Main] 결제 수단을 입력하세요: toss
 * [Main] 결제 금액을 입력하세요: 10000
 * [Main] PayService.processPay 실행
 * [PayService.processPay] 결제를 시작합니다: option=toss, amount=10000
 * [PayService.processPay] Dependency Injection: Pay pay = PayStore.findPay(option);
 * [PayStore.findPay] TossPay 객체 생성, Pay 변수에 할당하여 리턴
 * [TossPay.pay] 토스페이 시스템과 연결합니다.
 * [TossPay.pay] 10000원 결제를 시도합니다.
 * [PayService.processPay] 결제가 성공했습니다.
 * [Main] PayService.processPay 종료
 */