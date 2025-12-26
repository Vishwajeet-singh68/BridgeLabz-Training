package encapsulation.ecommerceplatform;

public class Main {
    public static void main(String[] args) {
        Product cloth=new Clothing(123,"pepe jeans", 2000);
        Product electronic=new Electronics(365, "Laptop", 50000);

        electronic.displayProductDetails();
    }
}
