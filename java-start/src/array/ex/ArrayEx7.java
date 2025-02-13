package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        // 1. 학생 성적 배열 생성 (2차원)
        int[][] studentsScore = new int[4][3];    // row: 학생  column: 해당 학생의 국/수/영 점수
        String[] subjects = new String[]{"국어", "영어", "수학"};

        // 2. 학생 성적 입력받아서 배열초기화
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < studentsScore.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < studentsScore[0].length; j++) {
                System.out.print(subjects[j] + " 점수: ");
                studentsScore[i][j] = sc.nextInt();
            }
        }

        // 3. 학생 당 총점과 평균계산
        for (int student = 0; student < studentsScore.length; student++) {
            int total = 0;
            for (int score = 0; score < studentsScore[0].length; score++) {
                total += studentsScore[student][score];
            }
            double averageScore = (double) total / studentsScore[0].length;
            System.out.println((student + 1) + "번 학생의 총점: " + total + ", 평균: " + averageScore);
        }
    }
}