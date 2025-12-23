import java.util.*;

public class QuadraticRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");  
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();
        double[] roots = findQuadraticRoots(a, b, c);
        if (roots.length == 0) {
            System.out.println("No real roots exist.");
        } else if (roots.length == 1) {
            System.out.println("One real root: " + roots[0]);
        } else {
            System.out.println("Two real roots: " + roots[0] + " and " + roots[1]);
        }
    }

    public static double[] findQuadraticRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return new double[0];
        } else if (delta == 0) {
            return new double[]{-b / (2 * a)};
        } else {
            double sqrtDelta = Math.sqrt(delta);
            return new double[]{(-b + sqrtDelta) / (2 * a), (-b - sqrtDelta) / (2 * a)};
        }
    }
}