import java.util.*;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int number = in.nextInt();
        System.out.print("Enter the exponent: ");
        int power = in.nextInt();
        int result = 1;
        for(int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println(number + " raised to the power of " + power + " is: " + result);
    }
}
