import java.util.*;
public class FirstNoSmallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the three numbers:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();        
        int num3 = in.nextInt();
        if (num1 < num2 && num1 < num3) {
            System.out.println("Is the first number the smallest? Yes.");
        } 
        else {
            System.out.println("Is the first number the smallest? No.");
        }
    }
}