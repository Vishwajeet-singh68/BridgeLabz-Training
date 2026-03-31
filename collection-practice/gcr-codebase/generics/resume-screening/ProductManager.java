package Generics.resumescreening;

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }
    public void displayRole() {
        System.out.println("Screening for: " + roleName);
    }
}
