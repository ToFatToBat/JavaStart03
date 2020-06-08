package Zjecia.cwiczenie1;

public class Shop {
    public static void main(String[] args) {
      //  Product product1 = new Product("TV", "Samsung", 6000, true);
      //  Product product2 = new Product("Computer", "Samsung", 4200, true);
      //  Product product3 = new Product("Computer", "Asus", 9400, true);

        Producer Samsung = new Producer("Samsung", "China");
        Producer Asus = new Producer("Asus", "China");


        Product product1 = new Product("TV", Samsung, 2000, true);
        Product product2 = new Product("TV", Asus, 3000, true);
        Product product3 = new Product("TV", Samsung, 5000, true);

        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(product3.toString());
    }
}
