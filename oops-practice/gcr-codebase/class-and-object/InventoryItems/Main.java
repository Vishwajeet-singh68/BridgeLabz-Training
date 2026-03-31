
public class Main {
    public static void main(String[] args) {
        String[] itemNames = {"Laptop", "Smartphone", "Tablet"};
        String[] itemCodes = {"ITM001", "ITM002", "ITM003"};
        double[] prices = {1200.50, 800.75, 450.00};

        Items inventory = new Items(itemNames, itemCodes, prices);

        for (int i = 0; i < itemNames.length; i++) {
            System.out.println("Item " + (i + 1) + " Details:");
            inventory.displayItems(i);
            System.out.println();
        }
    }
}
