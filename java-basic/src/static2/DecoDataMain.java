package static2;


import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();
        staticCall(data1);     // staticCall 이어도 data1 을 인자로 받아왔으므로 사용가능

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 추가
        // 인스턴스를 통한 우회 접근 (비추: 클래스 소속 메소드를 인스턴스로 호출하는 것은 의미를 흐트림)
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 직접 접근
        staticCall();
        /**
         * staticValue = 4
         * staticValue = 5
         */
    }
}

/**
 * 1. 정적 호출
 * staticValue = 1
 * 2. 인스턴스 호출1
 * instanceValue = 1
 * staticValue = 2
 * 3. 인스턴스 호출2
 * instanceValue = 1
 * staticValue = 3
 */