package encapsulation.ecommerceplatform;

public class Clothing extends Product {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.4;
    }
}
