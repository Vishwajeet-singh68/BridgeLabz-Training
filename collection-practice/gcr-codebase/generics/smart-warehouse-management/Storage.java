package Generics.smartwarehousemanagement;

import java.util.*;
public class Storage <T extends WarehouseItems>{
    List<T> items;
    public Storage(){
        items=new ArrayList<>();
    }

    public void addProduct(T product){
        items.add(product);
    }

    public void allProducts(){
        for(T product: items){
            System.out.println("Product Type: "+product.getType());
            System.out.println("Product ID: "+product.id);
            System.out.println("Product Name: "+product.name);
            System.out.println("Product Price: "+product.price);
        }
    }
}
