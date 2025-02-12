package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        // 1. 배열 생성
        int[] arr = new int[5];

        // 2. 원소입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 3. 원소 출력하기
        System.out.println("출력");
        for (int i = 0; i < (arr.length - 1); i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1]);
    }
}
