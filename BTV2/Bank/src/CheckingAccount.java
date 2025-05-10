public class CheckingAccount extends BankAccount {
    private double withdrawLimit;

    public CheckingAccount(String acc, String owner, double balance, double limit) {
        super(acc, owner, balance);
        this.withdrawLimit = limit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= withdrawLimit && amount <= balance) {
            balance -= amount;
            Bank.log("Rút " + amount + " từ tài khoản " + getAccountNumber());
        } else {
            Bank.log("Rút thất bại từ tài khoản " + getAccountNumber());
        }
    }

    @Override
    public void calculateInterest() {
        Bank.log("Tài khoản " + getAccountNumber() + " không có lãi suất.");
    }
}
