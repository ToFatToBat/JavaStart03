public class Product {
    String name;
    String producer;
    double price;
    boolean isAvailable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
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

    public Product(String name, String producer, double price, boolean isAvailable) {
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.isAvailable = isAvailable;


    }
}
