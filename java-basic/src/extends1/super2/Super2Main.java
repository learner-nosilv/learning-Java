package extends1.super2;

public class Super2Main {
    public static void main(String[] args) {
        ClassC classC = new ClassC();
        /**
         * ClassA Constructor
         * ClassB Constructor: 10, 20
         * ClassC constructor
         *
         * C 호출 -> (super)B 호출 -> (super)A 호출/실행
         */

        ClassB classB = new ClassB(10);
        /**
         * ClassA Constructor
         * ClassB Constructor: 10, 0
         * ClassB Constructor: 10
         */
    }
}
