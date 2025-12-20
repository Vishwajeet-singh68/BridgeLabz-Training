package scenariobased;
import java.util.*;
public class CoffeeCounter {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		while(true) {
			System.out.println("Enter your choice(1-4):\n"
					+ "1. Normal           (RS. 20)\n"
					+ "2. Cappuccino       (RS. 50)\n"
					+ "3. Cold Coffee      (RS. 85)\n"
					+ "4. exit");
			int coffeeType;
			while( true ) {
				coffeeType = in.nextInt();
				if(coffeeType > 0 && coffeeType <= 4)
					break;
				else {
					System.out.println("Enter valid choice (1-3)");
					continue;
				}
			}
			
			if(coffeeType==4) {
				System.out.println("Thank You!!!!");
				break;
			}
			
			System.out.println("Enter quantity: ");
			int quantity = in.nextInt();
			
			switch(coffeeType) {
				case 1:
					double normal=quantity*50;
					normal+=normal*(18.0/100);
					System.out.println("Total Cost for the Normal coffee: "+normal);
					break;
				
				case 2:
					double cappuccino=quantity*50;
					cappuccino+=cappuccino*(18.0/100);
					System.out.println("Total Cost for the Cappuccino: "+cappuccino);
					break;
					
				case 3:
					double coldCoffee=quantity*50;
					coldCoffee+=coldCoffee*(18.0/100);
					System.out.println("Total Cost for the Cold coffee: "+coldCoffee);
					break;
			}
		}
	}
}
