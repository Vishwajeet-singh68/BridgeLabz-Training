import java.util.*;
public class SideOfSquare {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double perimeter=in.nextDouble();
        double side=perimeter/4;
        System.out.println("The side of square whose perimeter "+perimeter+" is "+side);
    }
}
