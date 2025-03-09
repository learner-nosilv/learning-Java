package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();             // 같은 package인 pack에 존재
        pack.a.User u = new pack.a.User();  // 디른 package인 경우, full name 작성
    }
}
