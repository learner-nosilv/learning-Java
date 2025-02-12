package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        // 1. 입력받을 숫자의 갯수를 입력받아서 배열 선언
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 2. 입력받은 값으로 배열 초기화 하면서 3. 최대/최소 계산
        System.out.println(n + "개의 정수를 입력하세요:");
        int max = 0;
        int min = 0;
        for (int i = 0; i < n; i++) {
            // 배열 초기화
            arr[i] = sc.nextInt();
            if (i == 0) {
                max = min = arr[i];
            } else if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }

        // 4. 출력
        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
