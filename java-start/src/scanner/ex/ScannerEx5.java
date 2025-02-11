package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        // num1 에 작은 수 두기 : num1이 num2보다 큰 경우, 두 숫자를 교환합니다.
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        // num1 ~ num2 사이 모든 정수 출력
        System.out.print("두 숫자 사이의 모든 정수: ");
        for(int i=num1; i<num2; i++){
            System.out.print(i+", ");
        }
        System.out.println(num2);
    }
}
