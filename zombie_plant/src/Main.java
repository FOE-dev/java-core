public class Main {

    public static void main(String[] args) {
        PeaShooter peaShooter = new PeaShooter(8, 2);
        Zombie zombie = new Zombie(10, 1);

        while (peaShooter.isAlive() && zombie.isAlive() && zombie.getX() >= peaShooter.getX()) {
            System.out.println("\n Vòng mới ");
            zombie.update();
            peaShooter.update();

            // Kiểm tra khoảng cách để bắn
            if (Math.abs(zombie.getX() - peaShooter.getX()) <= 5) {
                peaShooter.shoot(zombie);
            }

            // Dừng nếu zombie chết
            if (!zombie.isAlive()) {
                System.out.println("Zombie đã bị tiêu diệt!");
                System.out.println("\nBạn đã thắng");
                break;
            }

            if (zombie.getX() < peaShooter.getX()) {
                System.out.println("Zombie đã vượt qua PeaShooter!");
                System.out.println("\nBạn đã thua");
                break;
            }
        }

    }
}
