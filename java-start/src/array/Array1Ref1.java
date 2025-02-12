package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students;         // int 형 배열을 담을 수 있는 변수 students 선언
        students = new int[5];  // int 형을 담을 수 있는 5칸의 배열(객체)을 생성하여 할당

        System.out.println("students = " + students);

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        System.out.println("학생1 점수: "+ students[0]);
        System.out.println("학생2 점수: "+ students[1]);
        System.out.println("학생3 점수: "+ students[2]);
        System.out.println("학생4 점수: "+ students[3]);
        System.out.println("학생5 점수: "+ students[4]);

        // 학생수가 100명이라면 ? - 100번 복붙해야함
        // 반복문 불가능 -> why: 변수이름이 다 다르니까

    }
}
