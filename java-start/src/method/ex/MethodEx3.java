package method.ex;

public class MethodEx3 {

    public static void main(String[] args) {
        int balance = 10000;

        // 입금 1000
        balance = deposit(1000, balance);
        // 출금 2000
        balance = withdraw(2000, balance);

        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int amount, int balance) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int amount, int balance) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

}