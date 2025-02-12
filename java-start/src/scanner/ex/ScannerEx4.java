package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("구구단의 단 수를 입력해주세요: ");
        int dan = sc.nextInt();

        System.out.println(dan + "단의 구구단:");
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + i + " = " + dan * i);
        }
    }
}
