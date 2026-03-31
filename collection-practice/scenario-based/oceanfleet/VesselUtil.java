package oceanfleet;

import java.util.*;
public class VesselUtil {
	private List<Vessel> vesselList;
	
	public VesselUtil() {
		vesselList = new ArrayList<>();
	}
	
	public void addVesselPerformance(Vessel vessel) {
		vesselList.add(vessel);
	}
	
	public Vessel getVesselById(String vesselId) {
		for(Vessel v: vesselList) {
			if(v.getVesselId().equals(vesselId))
				return v;
		}
		return null;
	}
	
	public List<Vessel> getHighPerformanceVessels(){
		Map<Double, List<Vessel>> map= new TreeMap<>(Collections.reverseOrder());
		for(Vessel v: vesselList) {
			if(!map.containsKey(v.getAverageSpeed())) {
				map.put(v.getAverageSpeed(), new ArrayList<>());
			}
			map.get(v.getAverageSpeed()).add(v);
		}
		for(double d: map.keySet()) {
			return map.get(d);
		}
		return null;
	}
}
