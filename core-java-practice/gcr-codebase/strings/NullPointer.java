package strings;

public class NullPointer {   // Changed class name to avoid conflict
    public static void main(String[] args) {
        handleNullPointerException();   
    }

    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null;
        System.out.println(text.length()); // This will throw NullPointerException
    }

    // Method to handle NullPointerException
    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println(text.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }
    }
}