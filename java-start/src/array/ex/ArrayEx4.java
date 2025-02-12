package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        // 1. 배열 선언 - 입력받아서 배열 초기화 + 2. 하면서 원소합계구하기
        Scanner sc = new Scanner (System.in);
        int[] arr = new int[5];
        int total = 0;
        System.out.println("5개의 정수를 입력하세요:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        // 2. 합계와 평균 계산 후 출력
        System.out.println("입력한 정수의 합계: " + total);
        double avg = (double) total / arr.length;
        System.out.println("입력한 정수의 평균: " + avg);
        sc.close();
    }
}
