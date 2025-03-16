package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);    // 클래스명.정적메소드()

        System.out.println("before:\t" + s);
        System.out.println("after:\t" + deco);
    }
}

/**
 * before:	hello java
 * after:	*hello java*
 */