import java.util.*;
public class PowerOfNumberWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number number: ");
        int number = in.nextInt();
        System.out.print("Enter the power: ");
        int power = in.nextInt();
        int result = 1;
        int i = 1;
        while(i <= power) {
            result *= number;
            i++;
        }
        System.out.println(number + " raised to the power of " + power + " is: " + result);
    }
}
