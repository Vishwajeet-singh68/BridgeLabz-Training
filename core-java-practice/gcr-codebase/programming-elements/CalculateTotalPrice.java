import java.util.*;

public class CalculateTotalPrice {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double unitPrice = in.nextDouble();
        int quantity = in.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("he total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}