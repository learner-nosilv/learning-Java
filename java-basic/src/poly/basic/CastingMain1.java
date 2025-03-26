package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent parent = new Child();
        // 단 자식의 기능은 호출할 수 없다 - 컴파일 오류
//    parent.childMethod();

        // 명시적 캐스팅: 다운 캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child) parent;
        child.childMethod();
    }
}

