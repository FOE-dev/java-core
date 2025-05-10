
        // Thêm dữ liệu mẫu
//        employees.add(new fulltimeemployee("FT01", "Nguyen Van A", 12000000));
//        employees.add(new parttimeemployee("PT01", "Le Thi B", 80, 100000));
//        employees.add(new fulltimeemployee("FT02", "Tran Van C", 15000000));
//        employees.add(new parttimeemployee("PT02", "Pham Thi D", 60, 120000));
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<employee> employees = new ArrayList<>();

        System.out.print("Nhập số lượng nhân viên: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin cho nhân viên thứ " + (i + 1));
            System.out.print("Loại nhân viên (1 - FullTime, 2 - PartTime): ");
            int type = Integer.parseInt(scanner.nextLine());

            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("Tên: ");
            String name = scanner.nextLine();

            if (type == 1) {
                System.out.print("Lương cố định: ");
                double salary = Double.parseDouble(scanner.nextLine());
                employees.add(new fulltimeemployee(id, name, salary));
            } else if (type == 2) {
                System.out.print("Số giờ làm: ");
                int hours = Integer.parseInt(scanner.nextLine());
                System.out.print("Lương theo giờ: ");
                double rate = Double.parseDouble(scanner.nextLine());
                employees.add(new parttimeemployee(id, name, hours, rate));
            } else {
                System.out.println("Loại không hợp lệ! Bỏ qua nhân viên này.");
            }
        }

        // Hiển thị thông tin và tính tổng lương
        double totalSalary = 0;
        System.out.println("\n=== DANH SÁCH NHÂN VIÊN ===");
        for (employee e : employees) {
            e.displayInfo();
            totalSalary += e.calculateSalary();
        }

        System.out.println("\nTổng lương công ty phải trả: " + totalSalary);
    }
}
