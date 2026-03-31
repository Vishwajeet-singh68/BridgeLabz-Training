package functionalinterface;

interface ConversionTool{
	
	static double kmToMiles(double distanceInKm) {
		return distanceInKm/1.6;
	}
	
	static double kgToLbs(double weightInKg) {
		return weightInKg*2.2;
	}
}

public class UnitConversionTool {
	public static void main(String[] args) {
		System.out.println(ConversionTool.kmToMiles(22.5)+" Miles");
		System.out.println(ConversionTool.kgToLbs(45)+" lbs");
	}
}
