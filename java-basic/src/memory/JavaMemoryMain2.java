package memory;

import static memory.JavaMemoryMain1.method2;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("method1 end");
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value: " + data2.getValue());
        System.out.println("method2 end");
    }
}
/** main() > method1() > method2()
 * main start
 * method1 start : 스텍프레임: 지역변수 data1( & Data 객체의 주소) / 힙: Data 클래스 인스턴스
 * method2 start : 스텍프레임: 지역변수 data2( & Data 객체의 주소)
 * data.value: 10
 * method2 end : 스텍프레임 삭제: 지역변수 data2 삭제
 * method1 end : 스텍프레임 삭제: 지역변수 data1 삭제 / 힙: Data 인스턴스를 참조하는 것이 없어짐 -> GC가 등장하여 제거
 * main end
 *
 */