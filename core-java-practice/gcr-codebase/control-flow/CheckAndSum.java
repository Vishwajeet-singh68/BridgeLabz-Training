import java.util.*;
public class CheckAndSum {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int number = in.nextInt();
        if(number>0) {
            int sum = number*(number+1)/2;
            System.out.println("Sum of n natural number is " + number + " natural numbers is: " + sum);
        } else {
            System.out.println("The number "+ number + " is not a natural number.");
        }
    }
}
