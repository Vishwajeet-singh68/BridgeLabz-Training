package Generics.smartwarehousemanagement;

public class Groceries extends WarehouseItems{

    public Groceries(String id, String name, double price) {
        super(name,id,price);
    }

    public String getType(){
        return "Groceries";
    }
}
