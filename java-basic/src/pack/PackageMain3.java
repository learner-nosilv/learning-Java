package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        Data data = new Data();                 // 같은 package인 pack에 존재
        User userA = new User();                // 디른 package이나 import한 경우, full name 안 써도 됨
        pack.b.User userB = new pack.b.User();  // 서로 다른 package에 같은 class를 사용해야하는 경우, 둘 중 하나만 import! full name 써야 함
    }
}