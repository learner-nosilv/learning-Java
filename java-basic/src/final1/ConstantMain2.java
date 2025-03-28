package final1;

public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수: "+Constant.MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("현재 참여자 수: " + currentUserCount);
        if(currentUserCount > Constant.MAX_USERS) {
            System.out.println("대기자로 등록합니다.");
            return;
        }
        System.out.println("게임에 참여합니다.");
    }
}
/**
 * 프로그램 최대 참여자 수: 1000
 * 현재 참여자 수: 999
 * 게임에 참여합니다.
 * 현재 참여자 수: 1000
 * 게임에 참여합니다.
 * 현재 참여자 수: 1001
 * 대기자로 등록합니다.
 * 현재 참여자 수: 1002
 * 대기자로 등록합니다.
 */