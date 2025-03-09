package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        // 1. 객체 선언 및 초기화
        MusicPlayerData player = new MusicPlayerData();

        // 2. 음악 플레이어 켜기
        player.isOn = true;
        System.out.println("음악 플레이어를 시작합니다!");

        // 3. 볼륨 증가
        player.volume++;
        System.out.println("음악 플레이어 볼륨: " + player.volume);

        // 4. 볼륨 증가
        player.volume++;
        System.out.println("음악 플레이어 볼륨: " + player.volume);

        // 5. 볼륨 감소
        player.volume--;
        System.out.println("음악 플레이어 볼륨: " + player.volume);

        // 6. 음악 플레이어의 상태 확인
        if (player.isOn == true) {
            System.out.println("음악 플레이어 상태: ON, 볼륨: " + player.volume);
        } else {
            System.out.println("음악 플레이어 상태: OFF");
        }

        // 7. 음악 플레이어 종료
        player.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}