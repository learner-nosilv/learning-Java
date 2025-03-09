package oop1.ex;

public class Account {
    // FIELD -----
    int balance = 0;    // 잔액

    // METHOD -----
    // 입금
    void deposit(int amount) {
        balance += amount;
    }

    // 출금
    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
            return;
        }
        balance -= amount;
    }

    // 잔고 확인
    int getBalance() {
        return balance;
    }
}