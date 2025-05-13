package view;
import java.util.Scanner;
import Controller.*;
import Model.*;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", "Nguyễn Văn A", 1000.0);
        ATMController atm = new ATMController(account);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n ATM Đơn Giản ");
            System.out.println("1. Xem số dư");
            System.out.println("2. Nạp tiền");
            System.out.println("3. Rút tiền");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.viewBalance();
                    break;
                case 2:
                    System.out.print("Nhập số tiền muốn nạp: ");
                    double depositAmount = scanner.nextDouble();
                    atm.depositMoney(depositAmount);
                    break;
                case 3:
                    System.out.print("Nhập số tiền muốn rút: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdrawMoney(withdrawAmount);
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng ATM!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
