package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;  // 결제해야 할 총 금액

        // 사용자 구매진행
        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();   // 입력한 옵션 저장

            switch (option) {
                case 1:     // 구매
                    input.nextLine();   // 버퍼 속 공백 제거
                    System.out.print("상품명을 입력하세요: ");
                    String itemName = input.nextLine();

                    System.out.print("상품의 가격을 입력하세요: ");
                    int itemPrice = input.nextInt();

                    System.out.print("구매 수량을 입력하세요: ");
                    int itemQuantity = input.nextInt();

                    int totalPrice = itemPrice * itemQuantity;  // 현재 합계
                    total += totalPrice;                        // 총 누적 합계
                    System.out.println("상품명: " + itemName + "\t가격: " + itemPrice + "\t수량: " + itemQuantity + "\t합계: " + totalPrice);
                    break;

                case 2:     // 결제
                    System.out.println("총 비용: " + total);
                    total = 0;
                    break;

                case 3:     // 무한 루프 탈출
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:    // 1, 2, 3 외의 값 입력 시
                    System.out.println("올바른 옵션을 선택해주세요.");
            }
        }

    }
}
