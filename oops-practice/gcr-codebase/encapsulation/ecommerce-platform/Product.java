package encapsulation.ecommerceplatform;

public abstract class Product{
    int productId;
    String name;
    double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount();

    public void displayProductDetails(){
        System.out.println("Product id:"+productId);
        System.out.println("Product name:"+name);
        System.out.println("Price:"+price);
        System.out.println("effective price:"+(price-calculateDiscount()));
    }
}
