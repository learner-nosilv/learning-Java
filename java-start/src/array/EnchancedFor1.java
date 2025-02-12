package array;

public class EnchancedFor1 {
    public static void main(String[] args) {
        int[] numbers={1, 2, 3,4,5};

        //  일반 for 문
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // for-each 문
        for(int number : numbers){
            System.out.print(number + " ");
        }
    }
}
