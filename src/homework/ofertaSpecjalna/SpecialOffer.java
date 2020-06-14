package homework.ofertaSpecjalna;

public class SpecialOffer {
   private Product product;
    private int daysOfPromotion;
    private double discount;
    private double discountPrice;



    public SpecialOffer(Product product, int daysOfPromotion, int discount) {
        this.product = product;
        this.daysOfPromotion = daysOfPromotion;
        this.discount = discount;
    }

    public double getDiscountPrice() {
        return ((1 - discount/100) * product.getPrice());
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getDaysOfPromotion() {
        return daysOfPromotion;
    }

    public void setDaysOfPromotion(int daysOfPromotion) {
        this.daysOfPromotion = daysOfPromotion;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "SpecialOffer{" +
                "product=" + product +
                ", daysOfPromotion=" + daysOfPromotion +
                ", discount=" + discount + " % " +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
