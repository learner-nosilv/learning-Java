package access;

public class Speaker {
    private int volume;     // 모든 외부호출차단

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if(volume >= 100) {
            System.out.println("최대 음량입니다. 음량을 더 이상 증가할 수 없습니다.");
        } else{
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        this.volume-=10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("volume = " + volume);
    }
}
