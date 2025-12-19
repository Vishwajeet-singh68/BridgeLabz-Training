import java.util.*;
public class GreatestFactor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find its greatest factor: ");
        int number = in.nextInt();
        for(int i = number-1; i >= 1; i--) {
            if(number % i == 0) {
                System.out.println("Greatest factor of " + number + " is: " + i);
                break;
            }
        }
    }
}
