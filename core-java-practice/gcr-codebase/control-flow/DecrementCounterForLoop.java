import java.util.*;
public class DecrementCounterForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}