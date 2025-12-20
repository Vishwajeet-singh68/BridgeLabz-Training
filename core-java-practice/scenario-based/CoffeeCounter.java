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
			int quantity = in.nextInt(),price;
			
			switch(coffeeType) {
				case 1:
					price=quantity*20;
					break;
				
				case 2:
					price=quantity*50;
					break;
					
				case 3:
					price=quantity*85;
					break;
				default:
					System.out.println("Invalid Choice. Enter again.");
					continue;
			}

			System.out.println("Item Price: RS. "+price);
			System.out.println("GST (18%): RS. "+(price*0.18));
			System.out.println("Total Price: RS. "+(price + price*0.18));
			System.out.println("Enjoy your Coffee!!!\n" );
		}
	}
}
