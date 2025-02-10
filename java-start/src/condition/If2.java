package condition;

public class If2 {
    public static void main(String[] args) {
        int age = 17;       // 사용자의 나이

        if(age >= 18){      // 나이가 17세 이상이면 다음 블럭 실행 | 17 >= 18 은 false
            System.out.println("성인입니다.");
        }
        else {   // 그렇지 않으면 (= 나이가 18세 미만이면) 다음 블럭 실행 | 17 < 18 은 true
            System.out.println("미성년자입니다.");
        }
    }
}
