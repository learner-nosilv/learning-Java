package array.ex;

import com.sun.source.tree.LiteralTree;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        // 0. 사용할 변수, 객체 준비
        Scanner sc = new Scanner(System.in);             // 사용자 입력을 받기 위한 Scanner 객체
        int maxProducts = 10;
        String[] productNames = new String[maxProducts]; // 상품 이름을 저장할 String 배열(크기: 10)
        int[] productPrices = new int[maxProducts];      // 상품 가격을 저장할 int 배열(크기: 10)
        int productCount=0;                              // 현재 등록된 상품의 개수를 저장할 int 변수

        while(true){

            // 1. 사용자에게 선택지 입력받기 (1. 상품 등록, 2. 상품 목록, 3. 종료)
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int menu = sc.nextInt(); sc.nextLine();

            // 2.
            switch(menu){
                case 1:
                    // 제약 조건
                    if(productCount >= maxProducts){        // 꽉 참 알림
                        System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    } else {
                        System.out.print("상품 이름을 입력하세요: ");
                        productNames[productCount] = sc.nextLine(); // 상품 이름
                        System.out.print("상품 가격을 입력하세요: ");
                        productPrices[productCount] = sc.nextInt(); sc.nextLine();
                        productCount ++;
                    }
                    break;
                case 2:
                    if(productCount == 0){
                        System.out.println("등록된 상품이 없습니다.");
                    }
                    for(int i=0;i<productCount; i++){
                        System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                    }
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }
    }
}
