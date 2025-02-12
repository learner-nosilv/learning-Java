package array;

public class Array1Ref3 {
    public static void main(String[] args) {
        int[] students;         // int 형 배열을 담을 수 있는 변수 students 선언
        students = new int[]{90,80,70,60,50};  // int 형을 담을 수 있는 5칸의 배열(객체)을 생성 및 값 할당

        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
        // 학생수가 100명이라면 ? - 100번 복붙해야함
        // 반복문 불가능 -> why: 변수이름이 다 다르니까

    }
}
