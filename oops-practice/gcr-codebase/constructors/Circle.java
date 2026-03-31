public class Circle {
    double radius;

    Circle() {
        this.radius = 1.0;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public void displayCircleDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (Math.PI * radius * radius));
        System.out.println("-----------------------------");
    }
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        defaultCircle.displayCircleDetails();

        Circle parameterizedCircle = new Circle(5.0);
        parameterizedCircle.displayCircleDetails();
    }
}