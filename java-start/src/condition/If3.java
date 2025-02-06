package condition;

public class If3 {
    public static void main(String[] args) {
        int age = 14;
        // 방법 1. if 만 사용하기 - if 문 5개
        if (age <= 7) {
            System.out.println("미취학");
        }
        if (age >= 8 && age <= 13) {
            System.out.println("초등학생");
        }
        if (age >= 14 && age <= 16) {
            System.out.println("중학생");
        }
        if (age >= 17 && age <= 19) {
            System.out.println("고등학생");
        }
        if (age >= 20) {
            System.out.println("성인");
        }
        /* 방법 1.
            단점 1) 불필요한 조건검사 (5번의 조건 검사)
                중간에 true가 나와서 실행을 해도
                남아있는 조건검사까지 다 해야함
            단점 2) 조건문의 중복체크
                if(age<=7) 에서 false 가 되면 이미 age>=8 인데
                다시 if(age>=8 && age <=13) 에서 또 조건검사하게 됨
         */
    }
}
