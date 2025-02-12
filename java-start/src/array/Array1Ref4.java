package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50, 40, 30};  // 배열 생성과 초기화
        // int[] students = new int[] {90, 80, 70, 60, 50} 에서 더 줄이기

        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
        // 학생수가 100명이라면 ? - 100번 복붙해야함
        // 반복문 불가능 -> why: 변수이름이 다 다르니까

    }
}
