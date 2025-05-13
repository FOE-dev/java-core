public class PeaShooter extends GameObject implements Shooter {

    public PeaShooter(int x, int y) {
        super(100, x, y);
    }

    @Override
    public void shoot(Zombie target) {
        System.out.println("PeaShooter bắn vào Zombie!");
        target.takeDamage(20);
    }

    @Override
    public void update() {
        System.out.println("PeaShooter đứng tại vị trí (" + x + ", " + y + "), HP: " + health);
    }
}
