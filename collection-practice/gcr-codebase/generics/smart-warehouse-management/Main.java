package Generics.smartwarehousemanagement;

public class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronics=new Storage<>();
        electronics.addProduct(new Electronics("ELE01", "Air Conditioner", 40000));
        electronics.addProduct(new Electronics("ELE01", "Refrigerator", 25000));
    }
}
