package Model;

public class Products {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Products(String id, String name, double price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return quantity;
    }

    public void setQuanlity(int count) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public void display() {
        System.out.println("Mã: " + id + ", Tên: " + name + ", Giá: " + price + ", SL: " + quantity + ", Tổng: " + getTotalPrice());
    }
}

