package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 새로운 개발자가 필드에 직접 접근 ----
        System.out.println("volume 필드 직접 접근 & 수정");
//        speaker.volume=200;
        speaker.showVolume();
        System.out.println("!!!! 200이라면 스피커 폭발 !!!!");
    }
}
