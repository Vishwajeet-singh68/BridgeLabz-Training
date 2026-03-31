package multithreading;

class Chef extends Thread{
	String dish;
	long time;
	
	Chef(String dish, long time){
		this.dish = dish;
		this.time = time;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"started preparing "+dish);
		long stepTime = time/4;
		for(int i = 25;i<=100;i+=25) {
			System.out.println(Thread.currentThread().getName()+" preparing "+dish+": "+i+"% complete");
			try {
				Thread.sleep(stepTime);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class RestaurantOrderProcessingSystem {
	public static void main(String[] args) throws InterruptedException {
		Chef chef1 = new Chef("Pizza",3000);
		Chef chef2 = new Chef("Pasta",2000);
		Chef chef3 = new Chef("Salad",1000);
		Chef chef4 = new Chef("Burger", 2500);
		
		chef1.start();
		chef2.start();
		chef3.start();
		chef4.start();
		
		chef1.join();
		chef2.join();
		chef3.join();
		chef4.join();
	}
}
