package condition;

public class If4 {
    public static void main(String[] args) {
        int age = 14;
        // 방법 2. if - else if - else 사용 - if 문 1개
        if (age <= 7) {
            System.out.println("미취학");
        } else if (age >= 8 && age <= 13) {
            System.out.println("초등학생");
        } else if (age >= 14 && age <= 16) {
            System.out.println("중학생");
        } else if (age >= 17 && age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
        /* 방법 2.
            방법 1의 단점 보완 1) 불필요한 조건검사 해결 (4회 이하의 조건 검사)
                중간에 true가 나오면 해당 블럭만 실행하고 if문 전체를 빠져나온다
            방법 1의 단점 보완 2) 조건문의 중복체크 해결
                if(age<=7) 에서 false 가 되면
                else if, else 는 위 조건이 거짓이라는 걸 반영한다.
                따라서 if(age>=8 && age <=13) 가 아닌
                else if(age <= 13) 만 조건검사하여 검사중복을 줄인다.
         */
    }
}
