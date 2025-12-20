package scenariobased;

import java.util.*;
public class MayaBMI {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.print("Enter the weight of the person (in kg): ");
	    double weight = in.nextDouble();
	    System.out.print("Enter the height of the person (in cm): ");
	    double height = in.nextDouble();
	    double heightInMeter = height / 100;
	    double bmi = weight / (heightInMeter * heightInMeter);
	    System.out.println("BMI of the person is: " + bmi);
	    if (bmi <= 18.4) {
	        System.out.println("Underweight");
	    } else if (bmi >= 18.5 && bmi < 25) {
	        System.out.println("Normal");
	    } else if (bmi >= 25 && bmi < 40) {
	        System.out.println("Overweight");
	    } else {
	        System.out.println("Obese");
	    }
	}
}
