package functionalinterface;

import java.util.*;
import java.util.function.Predicate;

public class TemperatureAlertSystem {
	static final int THRESHOLD = 50;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Predicate<Double> alert = (temp)-> temp>THRESHOLD;
		
		System.out.println("Enter the temperature: ");
		double temp = in.nextDouble();
		
		System.out.println(alert.test(temp)?"par threshold":"Normal");
	}
}
