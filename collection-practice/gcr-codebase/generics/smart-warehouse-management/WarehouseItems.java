package Generics.smartwarehousemanagement;

public abstract class WarehouseItems {
    String name;
    String id;
    double price;
    WarehouseItems(String id, String name, double price){
        this.name=name;
        this.id=id;
        this.price=price;
    }

    abstract String getType();
}
