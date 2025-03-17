package access.a;

public class AccessData {
    public int publicField;
    int packagePrivateField;
    private int privateField;

    public void publicMethod() {
        System.out.println("Public Method" + publicField);
    }

    void packagePrivateMethod() {
        System.out.println("Package Private Method"+ packagePrivateField);
    }

    private void privateMethod() {
        System.out.println("Private Method"+ privateField);
    }

    public void innerAccess(){
        System.out.println("Inner Access");
        publicField=100;
        packagePrivateField=200;
        privateField=300;
        publicMethod();
        packagePrivateMethod();
        privateMethod();
    }
}
