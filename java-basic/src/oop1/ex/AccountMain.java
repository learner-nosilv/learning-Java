package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.deposit(10000);
        myAccount.withdraw(9000);
        myAccount.withdraw(2000);   // 오류 메세지 출력 & 출금 안 될 예정
        System.out.println("잔고: " + myAccount.getBalance());
    }
}