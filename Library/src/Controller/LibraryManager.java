package Controller;

import Model.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    private ArrayList<Book> books = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Thêm sách
    public void addBook() {
        System.out.print("Nhập mã sách: ");
        String id = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        String title = sc.nextLine();
        System.out.print("Nhập tác giả: ");
        String author = sc.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        int year = sc.nextInt();
        sc.nextLine(); // clear buffer

        Book b = new Book(id, title, author, year);
        books.add(b);
        System.out.println(" Thêm sách thành công.");
    }

    // Tìm kiếm theo tên (có chứa chuỗi tìm kiếm, không phân biệt hoa thường)
    public void searchByTitle() {
        System.out.print("Nhập từ khóa tên sách: ");
        String keyword = sc.nextLine().toLowerCase();
        boolean found = false;
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(keyword)) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sách theo tên.");
        }
    }

    // Tìm kiếm theo tác giả (có chứa chuỗi tìm kiếm, không phân biệt hoa thường)
    public void searchByAuthor() {
        System.out.print("Nhập từ khóa tác giả: ");
        String keyword = sc.nextLine().toLowerCase();
        boolean found = false;
        for (Book b : books) {
            if (b.getAuthor().toLowerCase().contains(keyword)) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sách theo tác giả.");
        }
    }

    // Hiển thị tất cả sách
    public void showAll() {
        if (books.isEmpty()) {
            System.out.println("Danh sách sách trống.");
        } else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }
}
