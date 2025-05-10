import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.print("Nhập số lượng sinh viên: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("ID: ");
            String id = scanner.nextLine();

            System.out.print("Tên: ");
            String name = scanner.nextLine();

            System.out.print("Tuổi: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("GPA: ");
            double gpa = Double.parseDouble(scanner.nextLine());

            students.add(new Student(id, name, age, gpa));
        }

        // Hiển thị sinh viên có GPA >= 3.2
        System.out.println("\nDanh sách sinh viên có GPA >= 3.2:");
        for (Student s : students) {
            if (s.getGpa() >= 3.2) {
                s.display();
            }
        }

        // Sắp xếp theo GPA giảm dần
        students.sort((a, b) -> Double.compare(b.getGpa(), a.getGpa()));

        // Hiển thị danh sách sau khi sắp xếp
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo GPA giảm dần:");
        for (Student s : students) {
            s.display();
        }
    }
}
