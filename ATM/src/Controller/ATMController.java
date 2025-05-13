package Controller;
import Model.*;

public class ATMController {
    private BankAccount account;

    public ATMController(BankAccount account) {
        this.account = account;
    }

    public void viewBalance() {
        System.out.println("Số dư hiện tại: " + account.getBalance());
    }

    public void depositMoney(double amount) {
        account.deposit(amount);
    }

    public void withdrawMoney(double amount) {
        account.withdraw(amount);
    }
}
