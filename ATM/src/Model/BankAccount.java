package Model;

    public class BankAccount {
        private String accountNumber;
        private String ownerName;
        private double balance;

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
                System.out.printf("Đã nạp: %.0f VND\n", amount);
            } else {
                System.out.println("Số tiền nạp không hợp lệ!");
            }
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Số tiền rút không hợp lệ!");
            } else if (amount > balance) {
                System.out.println("Số dư không đủ!");
            } else {
                balance -= amount;
                System.out.println("Đã rút: " + amount);
            }
        }
    }
