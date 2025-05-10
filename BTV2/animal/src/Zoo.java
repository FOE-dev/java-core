import java.util.*;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    // Thêm con vật mới
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    // In tiếng kêu và hành động di chuyển
    public void showAnimals() {
        for (Animal animal : animals) {
            animal.makeSound();
            animal.move();
            System.out.println();
        }
    }

    // Thống kê số lượng mỗi loài
    public void countAnimals() {
        int dogs = 0, cats = 0, birds = 0;

        for (Animal a : animals) {
            if (a instanceof Dog) dogs++;
            else if (a instanceof Cat) cats++;
            else if (a instanceof Bird) birds++;
        }

        System.out.println(" Dogs: " + dogs);
        System.out.println(" Cats: " + cats);
        System.out.println(" Birds: " + birds);
    }
}
