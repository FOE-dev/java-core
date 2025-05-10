public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " kêu: Chip");
    }

    @Override
    public void move() {
        System.out.println(getName() + " bay ");
    }
}
