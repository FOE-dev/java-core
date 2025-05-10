import java.util.*;

public class Bank {
    private List<BankAccount> accounts = new ArrayList<>();
    private static List<String> logs = new ArrayList<>();

    public void addAccount(BankAccount acc) {
        accounts.add(acc);
        log("Thêm tài khoản: " + acc.getAccountNumber());
    }

    public BankAccount findAccount(String accNum) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accNum)) return acc;
        }
        return null;
    }

    public void deposit(String accNum, double amount) {
        BankAccount acc = findAccount(accNum);
        if (acc != null) acc.deposit(amount);
        else log("Không tìm thấy tài khoản: " + accNum);
    }

    public void withdraw(String accNum, double amount) {
        BankAccount acc = findAccount(accNum);
        if (acc != null) acc.withdraw(amount);
        else log("Không tìm thấy tài khoản: " + accNum);
    }

    public double getTotalBalance() {
        double total = 0;
        for (BankAccount acc : accounts) {
            total += acc.getBalance();
        }
        return total;
    }

    public void applyInterestToAll() {
        for (BankAccount acc : accounts) {
            acc.calculateInterest(); // Polymorphism!
        }
    }

    public void showLogs() {
        System.out.println("\n GIAO DỊCH ");
        for (String log : logs) System.out.println(log);
    }

    public static void log(String message) {
        logs.add(message);
    }
}
