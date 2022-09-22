package BankTask;

public class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    public void deposit(int amount) {

    }

    public boolean withDraw(int amount) {
        return true; // 임시 return;
    }

    public boolean transfer(int amount , BankAccount otherAccount) {
        return true;
    }
}
