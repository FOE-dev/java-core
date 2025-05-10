import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng động vật: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nChọn loại động vật (1: Dog, 2: Cat, 3: Bird): ");
            int choice = Integer.parseInt(sc.nextLine());

            System.out.print("Nhập tên: ");
            String name = sc.nextLine();

            switch (choice) {
                case 1:
                    zoo.addAnimal(new Dog(name));
                    break;
                case 2:
                    zoo.addAnimal(new Cat(name));
                    break;
                case 3:
                    zoo.addAnimal(new Bird(name));
                    break;
                default:
                    System.out.println("Loại không hợp lệ. Bỏ qua.");
            }
        }

        System.out.println("\n Danh sách động vật trong sở thú ");
        zoo.showAnimals();

        System.out.println("\n Thống kê số lượng mỗi loài ");
        zoo.countAnimals();
    }
}
