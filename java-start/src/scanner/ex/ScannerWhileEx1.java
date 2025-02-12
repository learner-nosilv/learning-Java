package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("이름을 입력하세요 (\"종료\"를 입력하면 종료): ");
            String name = sc.nextLine();    // \n 도 읽음

            // 무한 루프의 종료 조건
            if(name.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = sc.nextInt();     // 10\n 입력하나 10만 가져옴 (\n만 남음)
            sc.nextLine();
            System.out.println("입력한 이름: " + name + ", 나이: "+ age);
        }
    }
}
