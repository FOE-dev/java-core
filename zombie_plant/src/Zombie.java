public class Zombie extends GameObject implements Mover {

    public Zombie(int x, int y) {
        super(100, x, y);
    }

    @Override
    public void move() {
        x--;
        System.out.println("Zombie di chuyển đến (" + x + ", " + y + ")");
    }

    @Override
    public void update() {
        move();
    }
}
