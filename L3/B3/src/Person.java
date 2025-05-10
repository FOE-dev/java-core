public class Person {
    protected int id;
    protected String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ")";
    }

    public String getName() {
        return name;
    }
}
