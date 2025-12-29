package encapsulation.ecommerceplatform;

public class Groceries extends Product implements Taxable {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateTax() {
        return price * 0.05;
    }

    @Override
    public void getTaxableDetails() {
        System.out.println("5% GST");
        System.out.println("Total Tax amount:"+calculateTax());
    }

    @Override
    double calculateDiscount() {
        return price * 0.1;
    }
}
