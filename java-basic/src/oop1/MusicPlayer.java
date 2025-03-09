package oop1;

public class MusicPlayer {
    int volume= 0;
    boolean isOn = false;

    // 전원 켜기
    void on() {
        System.out.println("Music Player is on");
        isOn = true;
    }

    // 전원 끄기
    void off() {
        System.out.println("Music Player is off");
        isOn = false;
    }

    // 볼륨 1 증가
    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    // 볼륨 1 감소
    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    // 상태 확인
    void showStatus() {
        if (isOn == true) {
            System.out.println("음악 플레이어 상태: ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 상태: OFF");
        }
    }
}
