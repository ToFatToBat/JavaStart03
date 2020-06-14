package homework.ofertaSpecjalna;

public class App {
    public static void main(String[] args) {
        Category computers = new Category("Laptops", "All kind of computers that are portable");
        Category printers = new Category("Xerox", "Laser printer for photoprint");
        Product Asus = new Product("Asus", 5000, "Most efficient computer for games", computers);
        Product IBM = new Product("IBM", 9000, "Most powerful computer for business", computers);
        Product Epson = new Product("Epson", 2200, "Printer for labour", printers);
        SpecialOffer specialOfferAsus = new SpecialOffer(Asus, 10,5);

        System.out.println(specialOfferAsus.toString());

    }
}
