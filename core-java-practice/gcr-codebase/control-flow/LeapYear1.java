import java.util.*;
public class LeapYear1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = in.nextInt();
        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Year must be 1582 or later to be in the Gregorian calendar.");
        }
    }
}