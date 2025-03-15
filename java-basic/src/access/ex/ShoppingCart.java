package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemsSize=0;
    private int totalPrice =0;

    /** public Methods
     *  아이템 추가
     *  장바구니 상황 브리핑
     *  아이템 갯수 출력
     *  아이템 총 가격 출력
     */

    public void addItem(Item item) {
        // 실제 인자인 item 객체의 주소값이 복사되어온 상태

        // 검증 로직
        if(itemsSize>=10) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        // 실행 로직
        totalPrice += item.getTotalPrice();
        items[itemsSize] = item;
        itemsSize++;
    }

    private int calculateTotalPrice(){
        int totalPrice = 0;
        for(int i=0; i<itemsSize; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
    
    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for(int i=0; i<itemsSize; i++) {
            Item tempItem = items[i];
            System.out.println("["+ (i+1) +"] 상품명: "+ tempItem.getName()+",  단가: " + tempItem.getPrice() + ",  수량: "+ tempItem.getQuantity() + ",  합계: "+ tempItem.getTotalPrice());
        }
        System.out.println("전체 가격 합: "+getTotalPrice());
    }

    public int getItemsSize(){
        return itemsSize;
    }

    public int getTotalPrice(){
        return totalPrice;
    }
}
