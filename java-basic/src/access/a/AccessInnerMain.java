package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public: OK
        data.publicField = 1;
        data.publicMethod();

        // package-private: OK
        data.packagePrivateField = 2;
        data.packagePrivateMethod();

        // private
//        data.privateField=3;    // java: privateField has private access in access.a.AccessData
//        data.privateMethod();

        data.innerAccess();       // public 메소드
    }
}