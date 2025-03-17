package final1.ex;

public class Member {
    private final String id;    // final 설정
    private String name;

    public Member(String id, String name) {
        this.id = id;       // 추후 변경 불가
        this.name = name;
    }

    public void setData(String name) {
//        this.id=id;     // final 로 변경불가 - 컴파일 오류
        this.name = name;
    }

    public void print() {
        System.out.println("id: " + id + " name: " + name);
    }
}
