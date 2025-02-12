package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        // 1. 배열 크기를 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int n = sc.nextInt();

        // 2. 입력받은 크기로 배열 선언하기
        int[] arr = new int[n];

        // 3. 원소 입력받아서 배열 초기화 + 4. 하면서 원소합계구하기
        int total = 0;
        System.out.println(n + "개의 정수를 입력하세요:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        // 5. 합계와 평균 계산 후 출력
        System.out.println("입력한 정수의 합계: " + total);
        double avg = (double) total / n;
        System.out.println("입력한 정수의 평균: " + avg);
        sc.close();
    }
}
