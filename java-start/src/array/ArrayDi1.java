package array;

public class ArrayDi1 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[2][3]; // 2행 3열의 배열

        arr[0][0] = 1;  // 0행 0열
        arr[0][1] = 2;  // 0행 1열
        arr[0][2] = 3;  // 0행 2열
        arr[1][0] = 4;  // 1행 0열
        arr[1][1] = 5;  // 1행 1열
        arr[1][2] = 6;  // 1행 2열

        // row행 [0], [1]. [2] 출력
        for(int row=0; row<arr.length; row++){
            System.out.print(arr[row][0] + " ");    // row행 0열 출력
            System.out.print(arr[row][1] + " ");    // row행 1열 출력
            System.out.println(arr[row][2]);        // row행 2열 출력
        }
    }
}
