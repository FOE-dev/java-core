package Controller;

import java.util.regex.Pattern;
import java.text.Normalizer;
import Model.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    private ArrayList<Book> books = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public static String removeVietnameseTones(String str) {
        str = Normalizer.normalize(str, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        str = pattern.matcher(str).replaceAll("");
        return str.replaceAll("đ", "d").replaceAll("Đ", "D");
    }
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

    // Tìm kiếm theo tên (không dấu, không phân biệt hoa thường)
    public void searchByTitle() {
        System.out.print("Nhập từ khóa tên sách (không dấu): ");
        String keyword = sc.nextLine().toLowerCase();
        boolean found = false;
        String normalizedKeyword = removeVietnameseTones(keyword);

        for (Book b : books) {
            String normalizedTitle = removeVietnameseTones(b.getTitle()).toLowerCase();
            if (normalizedTitle.contains(normalizedKeyword)) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sách theo tên.");
        }
    }

    // Tìm kiếm theo tác giả (không dấu, không phân biệt hoa thường)
    public void searchByAuthor() {
        System.out.print("Nhập từ khóa tác giả (không dấu): ");
        String keyword = sc.nextLine().toLowerCase();
        boolean found = false;
        String normalizedKeyword = removeVietnameseTones(keyword);

        for (Book b : books) {
            String normalizedAuthor = removeVietnameseTones(b.getAuthor()).toLowerCase();
            if (normalizedAuthor.contains(normalizedKeyword)) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sách theo tác giả.");
        }
    }//


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
