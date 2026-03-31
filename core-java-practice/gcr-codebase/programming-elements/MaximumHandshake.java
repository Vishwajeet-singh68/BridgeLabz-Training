import java.util.*;
public class MaximumHandshake {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int handshake = (n * (n - 1)) / 2;
        System.out.println("Maximum number of handshakes is " + handshake);
    }
}