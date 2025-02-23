package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        // 학생 정보
        String[] studentName = new String[]{"학생1", "학생2","학생3", "학생4"};
        int[] studentAge = new int[]{15, 16, 17, 18};
        int[] studentGrade = new int[]{90, 80, 70, 60};

        // 학생 정보 출력
        for (int i = 0; i < studentName.length; i++) {
            System.out.println("이름: " + studentName[i] + "  나이: " + studentAge[i] + "  성적: " + studentGrade[i]);
        }
    }
}
