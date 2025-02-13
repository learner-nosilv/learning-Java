package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        // 1. 반복문으로 배열 선언
        int[] students = new int[5];

        // 2. 반복문으로 배열 초기화
        for (int i = 0; i < students.length; i++) {
            students[i] = (9 - i) * 10;
        }

        // 3. 반복문으로 배열 원소 총 합계 계산
        int total = 0;
        for (int student : students) {
            total += student;
        }

        // 4. 배열 length 활용하여 평균 계산
        double average = (double) total / students.length;

        // 5. 출력
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }

}
