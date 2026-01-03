package Generics.smartwarehousemanagement;

public class Furniture extends WarehouseItems{

    public Furniture(String id, String name, double price) {
        super(name,id,price);
    }

    public String getType(){
        return "Groceries";
    }
}
