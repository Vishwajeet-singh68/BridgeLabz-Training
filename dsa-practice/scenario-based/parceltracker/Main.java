package dsapractice.parceltracker;

public class Main {
	public static void main(String[] args) {
		Parcel parcel1 = new Parcel("1");
		
		parcel1.addStage("shipped");
		parcel1.addStage("out for delivery!");
		
		System.out.println(parcel1.trackParcel());
	}
}
