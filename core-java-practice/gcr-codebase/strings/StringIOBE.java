// Write a program to demonstrate StringIndexOutOfBoundsException
// Hint => 
// Define a variable of type String and take user input to assign a value
// Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. This will generate a runtime exception and abruptly stop the program.
// Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. Then write try catch block for Exception while accessing the String method
// From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

package strings;
import java.util.*;
public class StringIOBE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
        handleStringIndexOutOfBoundsException(str);
    }

    public static void handleStringIndexOutOfBoundsException(String str) {    
        try {  // catch the StringIndexOutOfBoundsException
            System.out.println(str.charAt(str.length())); // This will throw StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
        }
    }
}
