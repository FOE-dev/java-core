package model;

public class Triangle extends Shape {
    private double a, b, c; // 3 cạnh

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Công thức Heron
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
