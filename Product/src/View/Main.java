package View;
import java.util.Scanner;
import Controller.*;

public class Main {
    public static void main(String[] args) {
        ProductController service = new ProductController();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Tìm kiếm sản phẩm");
            System.out.println("5. Hiển thị tất cả");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    service.addProduct();
                    break;
                case 2:
                    service.updateProduct();
                    break;
                case 3:
                    service.deleteProduct();
                    break;
                case 4:
                    service.searchProduct();
                    break;
                case 5:
                    service.displayAll();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Chọn sai!");
            }
        } while (choice != 0);
    }
}
