package View;

import Controller.LibraryManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n Quản lý Thư viện");
            System.out.println("1. Thêm sách");
            System.out.println("2. Tìm sách theo tên");
            System.out.println("3. Tìm sách theo tác giả");
            System.out.println("4. Hiển thị tất cả sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    manager.addBook();
                    break;
                case 2:
                    manager.searchByTitle();
                    break;
                case 3:
                    manager.searchByAuthor();
                    break;
                case 4:
                    manager.showAll();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println(" Lựa chọn sai.");
            }
        } while (choice != 0);
    }
}
