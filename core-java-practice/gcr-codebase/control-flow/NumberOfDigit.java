import java.util.*;
public class NumberOfDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}