import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileHandler handler = null;

        System.out.println("Chọn loại file: ");
        System.out.println("1. Text File");
        System.out.println("2. Image File");
        System.out.println("3. Video File");
        System.out.print("Lựa chọn: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Bỏ dòng thừa

        System.out.print("Nhập tên file: ");
        String fileName = scanner.nextLine();

        switch (choice) {
            case 1:
                handler = new TextFileHandler(fileName);
                break;
            case 2:
                handler = new ImageFileHandler(fileName);
                break;
            case 3:
                handler = new VideoFileHandler(fileName);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                System.exit(0);
        }

        boolean running = true;
        while (running) {
            System.out.println("\nChọn thao tác:");
            System.out.println("1. Read");
            System.out.println("2. Write");
            System.out.println("3. Delete");
            if (handler instanceof Compressible)
                System.out.println("4. Compress");
            if (handler instanceof Encryptable)
                System.out.println("5. Encrypt");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn: ");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    handler.read();
                    break;
                case 2:
                    handler.write();
                    break;
                case 3:
                    handler.delete();
                    break;
                case 4:
                    if (handler instanceof Compressible) {
                        ((Compressible) handler).compress();
                    } else {
                        System.out.println("Chức năng không khả dụng!");
                    }
                    break;
                case 5:
                    if (handler instanceof Encryptable) {
                        ((Encryptable) handler).encrypt();
                    } else {
                        System.out.println("Chức năng không khả dụng!");
                    }
                    break;
                case 0:
                    running = false;
                    System.out.println("Thoát chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }

        scanner.close();
    }
}
