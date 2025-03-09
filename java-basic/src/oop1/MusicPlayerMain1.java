package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        // 1. 변수선언
        int volume = 0;
        boolean isOn = false;

        // 2. 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다!");

        // 3. 볼륨 증가
        volume ++;
        System.out.println("음악 플레이어 볼륨: "+ volume);

        // 4. 볼륨 증가
        volume ++;
        System.out.println("음악 플레이어 볼륨: "+ volume);

        // 5. 볼륨 감소
        volume --;
        System.out.println("음악 플레이어 볼륨: "+ volume);

        // 6. 음악 플레이어의 상태 확인
        if(isOn==true){
            System.out.println("음악 플레이어 상태: ON, 볼륨: "+ volume);
        } else {
            System.out.println("음악 플레이어 상태: OFF");
        }

        // 7. 음악 플레이어 종료
        isOn=false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
