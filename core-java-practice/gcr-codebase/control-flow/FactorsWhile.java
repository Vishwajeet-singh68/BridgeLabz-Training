import java.util.*;
public class FactorsWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int number = in.nextInt();
        System.out.println("Factors of " + number + " are:");
        int i = 1;
        while(i <= number) {
            if(number % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
