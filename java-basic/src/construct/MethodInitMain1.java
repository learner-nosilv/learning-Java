package construct;

import java.lang.reflect.Member;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        // 객체의 초기값 설정
        member1.name="user1";
        member1.age=15;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        // 객체의 초기값 설정
        member2.name="user2";
        member2.age=16;
        member2.grade = 80;

        MemberInit[] members = {member1, member2};

        for(MemberInit m : members) {
            System.out.println("이름: " + m.name + "  나이: " + m.age + "  성적: " + m.grade);
        }

    }
}
