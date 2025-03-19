package extends1.ex;

public class Movie extends Item{
    private String director;    // 감독
    private String actor;       // 배우

    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 감독: " + director + ", 배우: " + actor);
    }
}

/**
 * 이름: JAVA, 가격: 10000      - 부모 메소드
 * - 저자: han, isbn: 12345    - 오버라이드
 * 이름: Love poem, 가격: 15000 - 부모 메소드
 * - 아티스트: IU               - 오버라이드
 * 이름: 반지의 제왕, 가격: 18000  - 부모 메소드
 * - 감독: Peter Robert Jackson, 배우: Elijah Wood
 * 상품 가격의 합: 43000          - 부모 메소드 사용
 */