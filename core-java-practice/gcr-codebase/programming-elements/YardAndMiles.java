import java.util.*;
public class YardAndMiles {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double distanceInFeet = in.nextDouble(); 
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInFeet / 5280;

        System.out.println("The distance " + distanceInFeet + " feet in yards is " + distanceInYards);
        System.out.println("The distance " + distanceInFeet + " feet in miles is " + distanceInMiles);
    }
}
