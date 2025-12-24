public class Main {
    public static void main(String[] args) {
        String[] foodItems1 = {"Pizza", "Pasta", "Burger"};
        String[] foodItems2 = {"Sushi", "Ramen", "Tempura"};

        
        Restaurant restaurant1 = new Restaurant("Italian Delight", "123 Main St", foodItems1);
        Restaurant restaurant2 = new Restaurant("Tokyo Treats", "456 Elm St", foodItems2);
        
        System.out.println("Restaurant 1");
        restaurant1.displayDetails();
        System.out.println("\nRestaurant 2");
        restaurant2.displayDetails();
        
        System.out.println("\nChecking Food Availability:");
        System.out.println("Is Pasta available in Italian Delight? " + restaurant1.isFoodAvailable("Pasta"));
        System.out.println("Is Sushi available in Italian Delight? " + restaurant1.isFoodAvailable("Sushi"));
    }
}
