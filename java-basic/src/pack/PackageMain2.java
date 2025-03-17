package pack;

//import pack.a.User;
//import pack.a.User2;
import pack.a.*;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 package인 pack에 존재
        User u = new User();    // 디른 package이나 import한 경우, full name 안 써도 됨
        User2 u2 = new User2();
    }
}
