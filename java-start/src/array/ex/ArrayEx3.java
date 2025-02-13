package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        // 1. 배열을 선언한 후 사용자 입력으로 초기화하기
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println(arr.length + "개의 정수를 입력하세요:");
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        // 2. 배열의 원소 역순 출력
        System.out.println("입력한 정수를 역순으로 출력:");
        for(int i=(arr.length-1); i>0; i--){
            System.out.print(arr[i]+", ");
        }
        System.out.println(arr[0]);
    }
}
