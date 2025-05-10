public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // Getter (Encapsulation)
    public String getName() {
        return name;
    }

    // Abstract methods (Abstraction)
    public abstract void makeSound();
    public abstract void move();
}
