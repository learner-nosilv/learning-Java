package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // public method: 입금
    public void deposit(int amount) {
        // 입금값 검증로직
        if(isAmountValid(amount)) {
            balance += amount;
        } else{
            System.out.println("Invalid amount");
        }
    }

    // public method: 출금
    public void withdraw(int amount) {
        if(isAmountValid(amount) && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public method: 잔액확인
    public int getBalance() {
        return balance;
    }

    // 입력값 검증로직 (해당 클래스에서만 쓰므로 private)
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }
}
