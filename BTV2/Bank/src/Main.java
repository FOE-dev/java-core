import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Thêm tài khoản");
            System.out.println("2. Gửi tiền");
            System.out.println("3. Rút tiền");
            System.out.println("4. Tính lãi");
            System.out.println("5. Tổng số dư");
            System.out.println("6. Xem log");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Số tài khoản: ");
                    String acc = sc.nextLine();
                    System.out.print("Tên: ");
                    String name = sc.nextLine();
                    System.out.print("Số dư: ");
                    double bal = Double.parseDouble(sc.nextLine());

                    System.out.print("Loại (1: Tiết kiệm, 2: Thanh toán): ");
                    int type = Integer.parseInt(sc.nextLine());

                    if (type == 1) {
                        bank.addAccount(new SavingsAccount(acc, name, bal));
                    } else {
                        System.out.print("Hạn mức rút: ");
                        double limit = Double.parseDouble(sc.nextLine());
                        bank.addAccount(new CheckingAccount(acc, name, bal, limit));
                    }
                    break;
                case 2:
                    System.out.print("Tài khoản: ");
                    String accD = sc.nextLine();
                    System.out.print("Số tiền: ");
                    double amtD = Double.parseDouble(sc.nextLine());
                    bank.deposit(accD, amtD);
                    break;
                case 3:
                    System.out.print("Tài khoản: ");
                    String accW = sc.nextLine();
                    System.out.print("Số tiền: ");
                    double amtW = Double.parseDouble(sc.nextLine());
                    bank.withdraw(accW, amtW);
                    break;
                case 4:
                    bank.applyInterestToAll();
                    break;
                case 5:
                    System.out.println("Tổng số dư: " + bank.getTotalBalance());
                    break;
                case 6:
                    bank.showLogs();
                    break;
                case 0:
                    System.out.println("Thoát.");
                    return;
                default:
                    System.out.println("Sai lựa chọn.");
            }
        }
    }
}
