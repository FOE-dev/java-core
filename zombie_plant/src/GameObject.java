public abstract class GameObject {
    protected int health;
    protected int x, y;

    public GameObject(int health, int x, int y) {
        this.health = health;
        this.x = x;
        this.y = y;
    }

    public abstract void update();

    public void takeDamage(int amount) {
        health -= amount;
        System.out.println(this.getClass().getSimpleName() + " bị mất " + amount + " HP. HP còn lại: " + health);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

