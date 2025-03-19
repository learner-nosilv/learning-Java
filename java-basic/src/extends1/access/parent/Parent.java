package extends1.access.parent;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    int packagePrivateValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("parent.publicMethod");
    }
    protected void protectedMethod() {
        System.out.println("parent.protectedMethod");
    }
    void packagePrivateMethod() {
        System.out.println("parent.packagePrivateMethod");
    }
    private void privateMethod() {
        System.out.println("parent.privateMethod");
    }

    public void printParent(){
        System.out.println("== parent.printParent 시작 ==");
        System.out.println("publicValue: " + publicValue);
        System.out.println("protectedValue: " + protectedValue);
        System.out.println("packagePrivateValue: " + packagePrivateValue);
        System.out.println("privateValue: " + privateValue);

        // 부모 메서드 안에서 모두 접근 가능
        publicMethod();
        protectedMethod();
        packagePrivateMethod();
        privateMethod();

        System.out.println("== parent.printParent 종료 ==");
    }
}
