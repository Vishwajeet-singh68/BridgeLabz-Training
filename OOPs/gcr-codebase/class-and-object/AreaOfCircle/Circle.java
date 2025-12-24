public class Circle {
	
	double radius;
	
	Circle(double radius){
		this.radius=radius;
	}
	
	public void areaCircle() {
		System.out.println("Area of circle: "+(Math.PI*radius*radius));
	}
	
	public void circumferenceCircle() {
		System.out.println("Circumference of circle: "+(2*Math.PI*radius));
	}
}
