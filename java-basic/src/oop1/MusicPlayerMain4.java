package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        // MusicPlayer 클래스를 만들지 않은 개발자가 사용한다고 가정해보자
        MusicPlayer mp = new MusicPlayer();
        // 플레이어 켜기
        mp.on();
        // 볼륨 증가
        mp.volumeUp();
        // 볼륨 증가
        mp.volumeUp();
        // 볼륨 감소
        mp.volumeDown();
        // 플레이어 상태
        mp.showStatus();
        // 플레이어 끄기
        mp.off();




    }
}
