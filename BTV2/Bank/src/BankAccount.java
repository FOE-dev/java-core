public abstract class BankAccount {
    private String accountNumber;
    private String ownerName;
    protected double balance; // Cho phép lớp con truy cập

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            Bank.log("Gửi " + amount + " vào tài khoản " + accountNumber);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            Bank.log("Rút " + amount + " từ tài khoản " + accountNumber);
        } else {
            Bank.log("Rút thất bại từ tài khoản " + accountNumber + " (Số dư không đủ)");
        }
    }

    public abstract void calculateInterest();
}
