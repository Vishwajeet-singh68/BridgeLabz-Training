import java.util.*;
public class AbundantNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        int originalNumber = number;
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum > originalNumber) {
            System.out.println(originalNumber + " is an Abundant number.");
        } else {
            System.out.println(originalNumber + " is not an Abundant number.");
        }
    }
}