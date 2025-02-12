package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        // 1. 학생 수 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수를 입력하세요: ");
        int totalstudents = sc.nextInt();

        // 2. 학생 성적 배열 생성 (2차원)
        int[][] studentsScore = new int[totalstudents][3];    // row: 학생  column: 해당 학생의 국/수/영 점수
        String[] subject = new String[]{"국어", "영어", "수학"};

        // 3. 학생 성적 입력받아서 배열초기화
        for (int student = 0; student < studentsScore.length; student++) {
            System.out.println((student + 1) + "번 학생의 성적을 입력하세요:");
            for (int score = 0; score < studentsScore[0].length; score++) {
                System.out.print(subject[score] + " 점수: ");
                studentsScore[student][score] = sc.nextInt();
            }
        }

        // 4. 학생 당 총점과 평균계산
        for (int student = 0; student < studentsScore.length; student++) {
            int totalScore = 0;
            for (int score = 0; score < studentsScore[0].length; score++) {
                totalScore += studentsScore[student][score];
            }
            double averageScore = (double) totalScore / studentsScore[0].length;
            System.out.println((student + 1) + "번 학생의 총점: " + totalScore + ", 평균: " + averageScore);
        }
    }
}