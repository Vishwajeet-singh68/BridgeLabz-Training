import java.util.*;
public class CalculateGrades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the marks obtained in Physics, chemistry and maths respectively (0-100): ");
        int physics = in.nextInt();
        int chemistry = in.nextInt();
        int maths = in.nextInt();
        int average = (physics + chemistry + maths) / 3;
        if (average >= 80) {
            System.out.println("Grade: A");
        } else if (average >= 70) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else if (average >= 50) {
            System.out.println("Grade: D");
        } else if (average >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }
    }
}
