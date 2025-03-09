package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
        // this. 를 사용하지 않아도 멤버변수에 잘 접근합니다
        // Java 가 자동으로 붙여줌
    }
}
