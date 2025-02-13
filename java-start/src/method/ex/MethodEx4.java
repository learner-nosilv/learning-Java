package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int balance = 0;   // 잔액

        while (true) {
            // 1. 메뉴보여주고 입력받기
            int menu = getMenu();

            // 2. 선택한 메뉴별 진행
            switch (menu) {
                case 1:     // 입금
                    balance = deposit(balance);
                    break;
                case 2:     // 출금
                    balance = withdraw(balance);
                    break;
                case 3:     // 잔액확인
                    System.out.println("현재 잔액: " + balance + "원");
                    break;
                case 4:     // 종료
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:    // 메뉴입력오류
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");

            }
        }
    }

    public static int getMenu() {
        // 1. 메뉴판 보여주기
        System.out.println("-------------------------------------");
        System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
        System.out.println("-------------------------------------");

        // 2. 사용자 메뉴 입력받기
        System.out.print("선택: ");
        return sc.nextInt();
    }

    public static int deposit(int balance) {
        System.out.print("입금액을 입력하세요: ");
        int amount = sc.nextInt();
        balance += amount;
        System.out.println(amount + "을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance) {
        System.out.print("출금액을 입력하세요: ");
        int amount = sc.nextInt();
        if (amount > balance) {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        } else {
            balance -= amount;
            System.out.println(amount + "을 출금하였습니다. 현재 잔액: " + balance);
        }
        return balance;
    }
}
