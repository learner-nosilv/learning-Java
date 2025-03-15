package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public: OK
        data.publicField = 1;
        data.publicMethod();

        // 다른 패키지에서는 (b 소속) default에의 접근 불가_
        // package-private: No
//        data.packagePrivateField = 2;
//        data.packagePrivateMethod();

        // private
//        data.privateField=3;    // java: privateField has private access in access.a.AccessData
//        data.privateMethod();

        data.innerAccess();       // public 메소드
    }
}