package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        MovieReview suha = new MovieReview();
        suha.title = "모아나2";
        suha.review = "악역 노래가 제일 좋아!";

        MovieReview seha = new MovieReview();
        seha.title = "사랑의 하츄핑";
        seha.review = "엄마도 좋아하는 영화";

        MovieReview teemo = new MovieReview();
        teemo.title = "하얀 마음 백구";
        teemo.review = "역시 내 친구v";

        // 영화 리뷰 인스턴스 -> 배열화
        MovieReview[] reviews = new MovieReview[]{suha, seha, teemo};

        // 영화 리뷰 정보 출력
        for (MovieReview r : reviews) {
            System.out.println("영화 제목: " + r.title + ", 리뷰: " + r.review);
        }
    }
}
