package Controller;

import Model.Products;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    private ArrayList<Products> products = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addProduct() {
        System.out.print("Nhập mã: ");
        String id = sc.nextLine();
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập số lượng: ");
        int quantity = Integer.parseInt(sc.nextLine());

        products.add(new Products(id, name, price, quantity));
        System.out.println(" Đã thêm sản phẩm.");
    }

    public void updateProduct() {
        System.out.print("Nhập mã sản phẩm cần sửa: ");
        String id = sc.nextLine();
        Products p = findProductById(id);
        if (p != null) {
            System.out.print("Nhập tên mới: ");
            p.setName(sc.nextLine());
            System.out.print("Nhập giá mới: ");
            p.setPrice(Double.parseDouble(sc.nextLine()));
            System.out.print("Nhập số lượng mới: ");
            p.setQuanlity(Integer.parseInt(sc.nextLine()));
            System.out.println(" Đã cập nhật sản phẩm.");
        } else {
            System.out.println(" Không tìm thấy sản phẩm.");
        }
    }

    public void deleteProduct() {
        System.out.print("Nhập mã sản phẩm cần xóa: ");
        String id = sc.nextLine();
        Products p = findProductById(id);
        if (p != null) {
            products.remove(p);
            System.out.println(" Đã xóa sản phẩm.");
        } else {
            System.out.println(" Không tìm thấy sản phẩm.");
        }
    }

    public void searchProduct() {
        System.out.print("Nhập mã sản phẩm cần tìm: ");
        String id = sc.nextLine();
        Products p = findProductById(id);
        if (p != null) {
            System.out.println("\n Thông tin sản phẩm ");
            p.display();
        } else {
            System.out.println(" Không tìm thấy sản phẩm.");
        }
    }

    public void displayAll() {
        if (products.isEmpty()) {
            System.out.println(" Danh sách sản phẩm rỗng.");
        } else {
            System.out.println("\n Danh sách sản phẩm ");
            for (Products p : products) {
                p.display();
            }
        }
    }

    private Products findProductById(String id) {
        for (Products p : products) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }
}
