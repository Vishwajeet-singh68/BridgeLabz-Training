import java.util.*;
public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find its greatest factor: ");
        int number = in.nextInt();
        int i = number - 1;
        while(i >= 1) {
            if(number % i == 0) {
                System.out.println("Greatest factor of " + number + " is: " + i);
                break;
            }
            i--;
        }
    }
}