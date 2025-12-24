public class Product {
    static int totalProducts = 0;
    String productName;
    double productPrice;

    Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        totalProducts++;
    }

    public void displayProductDetail(){
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
    }

    public static int displayTotalProducts(){
        return totalProducts;
    }
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1500.00);
        Product product2 = new Product("Smartphone", 800.00);

        product1.displayProductDetail();
        System.out.println("-----------------------------");
        product2.displayProductDetail();
        System.out.println("-----------------------------");

        System.out.println("Total Products Created: " + Product.displayTotalProducts());
    }
}
