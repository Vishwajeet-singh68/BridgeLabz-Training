package streambuzz;

import java.util.*;
public class Program {
	private List<CreatorStats> records;
	
	Program(){
		records = new ArrayList<>();
	}
	
	public void registerCreator(CreatorStats record) {
		records.add(record);
	}
	
	public Map<String, Integer> getTopPostCounts(double likeThreshold){
		Map<String, Integer> map = new HashMap<>();
		for(CreatorStats creator: records) {
			for(double d: creator.weeklyLikes) {
				if(d>=likeThreshold)
					map.put(creator.creatorName, map.getOrDefault(creator.creatorName, 0)+1);
			}
		}
		return map;
	}
	
	public double averageLikes() {
		double sum = 0;
		for(CreatorStats creator: records) {
			for(double d: creator.weeklyLikes) {
				sum+=d;
			}
		}
		return sum/(records.size()*4);
	}
}
