package Generics.smartwarehousemanagement;

public class Electronics extends WarehouseItems{

    public Electronics(String id, String name, double price) {
        super(name,id,price);
    }

    public String getType(){
        return "Groceries";
    }
}
