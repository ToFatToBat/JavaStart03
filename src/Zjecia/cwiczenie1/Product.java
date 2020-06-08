package Zjecia.cwiczenie1;

public class Product {
    private String name;
    private Producer producer;
    private double price;
    private boolean isAvailable;

    public Product(String name, Producer producer, double price, boolean isAvailable) {
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", producer=" + producer +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
