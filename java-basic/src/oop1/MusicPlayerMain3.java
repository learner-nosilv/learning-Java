package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        // 1. 객체 선언 및 초기화
        MusicPlayerData player = new MusicPlayerData();

        // 2. 음악 플레이어 켜기
        on(player);     // player.isOn = true;
        System.out.println("음악 플레이어를 시작합니다!");

        // 3. 볼륨 증가
        volumeUp(player);   // player.volume++;
                            // System.out.println("음악 플레이어 볼륨: " + player.volume);

        // 4. 볼륨 증가
        volumeUp(player);   // player.volume++;
                            // System.out.println("음악 플레이어 볼륨: " + player.volume);

        // 5. 볼륨 감소
        volumeDown(player); // player.volume--;
                            // System.out.println("음악 플레이어 볼륨: " + player.volume);

        // 6. 음악 플레이어의 상태 확인
        showStatus(player);
//        if (player.isOn == true) {
//            System.out.println("음악 플레이어 상태: ON, 볼륨: " + player.volume);
//        } else {
//            System.out.println("음악 플레이어 상태: OFF");
//        }

        // 7. 음악 플레이어 종료
        off(player);     // player.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    // 전원 켜기
    static void on(MusicPlayerData player) {
        player.isOn = true;
    }

    // 전원 끄기
    static void off(MusicPlayerData player) {
        player.isOn = false;
    }

    // 볼륨 1 증가
    static void volumeUp(MusicPlayerData player) {
        player.volume++;
        System.out.println("음악 플레이어 볼륨: " + player.volume);
    }

    // 볼륨 1 감소
    static void volumeDown(MusicPlayerData player) {
        player.volume--;
        System.out.println("음악 플레이어 볼륨: " + player.volume);
    }

    // 상태 확인
    static void showStatus(MusicPlayerData player) {
        if (player.isOn == true) {
            System.out.println("음악 플레이어 상태: ON, 볼륨: " + player.volume);
        } else {
            System.out.println("음악 플레이어 상태: OFF");
        }
    }

}