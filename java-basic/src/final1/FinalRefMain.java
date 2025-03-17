package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();   // 참조형 불변
//        data = new Data();  // final 이므로 참조 대상 변경 불가
        // 참조 대상은 final에 의해 변경 불가하나,
        // 참조 대상의 값은 final 설정이 안되어 있으므로 변경 가능
        data.value = 10;

    }
}
