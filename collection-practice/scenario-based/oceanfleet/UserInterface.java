package oceanfleet;

import java.io.*;
public class UserInterface {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		VesselUtil vesselUtil = new VesselUtil();
		System.out.println("Enter the number of vessels to be added");
		int n = Integer.parseInt(in.readLine());
		System.out.println("Enter vessel details");
		while(n-->0) {
			String details = in.readLine();
			String afterSplit[] = details.split(":");
			Vessel vessel = new Vessel(afterSplit[0],afterSplit[1],Double.parseDouble(afterSplit[2]),afterSplit[3]);
			
			vesselUtil.addVesselPerformance(vessel);
		}
		
		System.out.println("Enter the Vessel Id to check speed: ");
		String vesselId = in.readLine();
		Vessel vessel = vesselUtil.getVesselById(vesselId);
		if(vessel==null) {
			System.out.println("Vessel Id "+vesselId+" not found");
		}
		else {
			System.out.println(vessel);
		}
		
		System.out.println("High performance vessels are");
		for(Vessel v: vesselUtil.getHighPerformanceVessels()) {
			System.out.println(v);
		}
	}
}
