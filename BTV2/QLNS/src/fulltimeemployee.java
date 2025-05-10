public class fulltimeemployee extends employee {
    private double fixedSalary;

    public fulltimeemployee(String id, String name, double fixedSalary) {
        super(id, name);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary;
    }
}
