package streambuzz;

import java.util.*;
import java.util.Map.Entry;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Program program = new Program();
		
		while(true) {
			System.out.println("1. Register Creator ");
			System.out.println("1. Show Top Posts ");
			System.out.println("3. Calculate Average Likes ");
			System.out.println("4. Exit ");
			System.out.println("Enter your choice: ");
			int choice = in.nextInt();
			
			if(choice == 4) {
				System.out.println("Logging off - Keep Creating with StreamBuzz!");
				break;
			}
			
			switch (choice) {
			case 1: {
				System.out.println("Enter Creator Name:");
				String name = in.next();
				System.out.println("Enter weekly likes (Week 1 to 4):");
				double weeklyLikes[] = {in.nextDouble(),in.nextDouble(),in.nextDouble(),in.nextDouble()};
				
				CreatorStats creator = new CreatorStats(name, weeklyLikes);					
				
				program.registerCreator(creator);
				
				System.out.println("Creator Registered Successfully!");
				break;
			}
			case 2: {
				System.out.println("Enter the like Threshold: ");
				int likeThreshold = in.nextInt();
				Map<String, Integer> topPosts = program.getTopPostCounts(likeThreshold);
				if(topPosts.isEmpty()) {
					System.out.println("No top-performing posts this week");
				}
				for(Entry<String, Integer> entry: topPosts.entrySet()) {
					System.out.println(entry.getKey()+" - "+entry.getValue());
				}
				break;
			}
			case 3: {
				System.out.println("Overall aver"
						+ "age Weekly likes: "+program.averageLikes());
				break;
			}
			default:
				System.out.println("Invalid choice.. Make your choice again!");
			}
		}
	}
}
