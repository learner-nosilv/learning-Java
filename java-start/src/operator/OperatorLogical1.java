package operator;

public class OperatorLogical1 {
    public static void main(String[] args) {
        System.out.println("&&: AND 연산");
        System.out.println("true && true : " + (true && true));
        System.out.println("true && false : " + (true && false));
        System.out.println("false && true : " + (false && true));
        System.out.println("false && false : " + (false && false));

        System.out.println("||: OR 연산");
        System.out.println("true || true : " + (true || true));
        System.out.println("true || false : " + (true || false));
        System.out.println("false || true : " + (false || true));
        System.out.println("false || false : " + (false || false));

        System.out.println("!: NOT 연산");
        System.out.println("!true : " + (!true));
        System.out.println("!false : " + (!false));

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.print("a = " + a);
        System.out.println(", b = " + b);
        System.out.println("a && b : " + (a && b));
        System.out.println("a || b : " + (a || b));
        System.out.println("!a : " + (!a));
        System.out.println("!b : " + (!b));


    }
}
