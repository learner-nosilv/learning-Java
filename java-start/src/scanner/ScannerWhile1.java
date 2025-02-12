package scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요(exit: 종료): ");
            String str = sc.nextLine();
            // 무한루프 탈출조건
            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열: " + str);
        }
    }
}
