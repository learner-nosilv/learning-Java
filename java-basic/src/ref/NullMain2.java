package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10;    // 가리키는 객체가 없는 상태
    }
}

/*
Exception in thread "main" java.lang.NullPointerException:
Null Pointer 예외가 발생했어요!
Cannot assign field "value" because "data" is null
data 값이 null이기 때문에 value 필드에 할당할 수 없어요
at ref.NullMain2.main(NullMain2.java:6)
 */