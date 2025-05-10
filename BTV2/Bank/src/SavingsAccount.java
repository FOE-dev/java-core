public class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.03;

    public SavingsAccount(String acc, String owner, double balance) {
        super(acc, owner, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        Bank.log("Tính lãi " + interest + " cho tài khoản " + getAccountNumber());
    }
}
