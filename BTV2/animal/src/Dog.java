public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " kêu: Gâu gâu");
    }

    @Override
    public void move() {
        System.out.println(getName() + " đi = 4 chân");
    }
}
