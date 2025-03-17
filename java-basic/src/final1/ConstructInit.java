package final1;

public class ConstructInit {
    final int value;    // 최초 1회 초기화 이후 변경불가

    public ConstructInit(int value) {
        this.value = value;
    }
}
