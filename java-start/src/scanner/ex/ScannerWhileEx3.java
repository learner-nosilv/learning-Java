package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;        // 입력값 총 합계
        int count = 0;      // 입력값 갯수 (-1 제외)

        System.out.println("숫자를 입력하세요. 입력을 중단하면 -1을 입력하세요:");
//        while (true) {
//            int num = input.nextInt();
//            input.nextLine();
//            // 무한루프 탈출 조건
//            if (num == -1) {
//                break;
//            }
//            sum += num;
//            count++;
//        }

        int num;
        while ((num = input.nextInt()) != -1) {
            sum += num;
            count++;
        }

        System.out.println("입력한 숫자들의 합계: " + sum);
        double avg = (double) sum / count;      // int/int 는 소숫점 손실이 나므로 명시적 형변환 진행
        System.out.println("입력한 숫자들의 평균: " + avg);
    }
}
