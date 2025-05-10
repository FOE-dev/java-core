public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " Kêu: meow ");
    }

    @Override
    public void move() {
        System.out.println(getName() + " đi nhẹ nhàng ");
    }
}
