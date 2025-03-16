package static1;

public class Data3 {
    public String name;
    public static int count;    // static: method 영역 공유 변수

    public Data3(String name) {
        this.name = name;
        Data3.count++;
    }
}
