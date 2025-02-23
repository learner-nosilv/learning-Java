package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;   // 아직 참조할 주소가 없어요
        System.out.println("1. data = " + data);

        data = new Data();  // 새로 만든 Data 객체의 참조값을 할당해요
        System.out.println("2. data = " + data);

        data = null;        // 다시 참조할 주소를 없애요
        System.out.println("3. data = " + data);

    }
}