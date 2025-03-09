package construct;

public class MemberInit {
    // field ------
    String name;
    int age;
    int grade;

    // method -------
    void initMember(String name, int age, int grade) {
        this.name=name;     // this : 내 인스턴스의
        this.age=age;
        this.grade=grade;
    }
}
