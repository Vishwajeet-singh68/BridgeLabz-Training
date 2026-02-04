package multithreading;

class TaskRunner extends Thread{
	int number;
	
	TaskRunner(int number){
		this.number = number;
	}
	@Override
	public void run() {
		for(int i=0;i>=0;i++) {
			System.out.println(Thread.currentThread().getName()+" state is: "+Thread.currentThread().getState());
			System.out.println(number+" * "+i+" = "+(number*i));
		}
	}
}
public class ThreadStateMonitoringSystem {
	public static void main(String[] args) throws InterruptedException {
		TaskRunner thread1 = new TaskRunner(5);
		System.out.println("State after creation: "+thread1.getState());
		
		thread1.start();
		Thread.sleep(1000);
		
		System.out.println("Current State: "+thread1.getState());
		
		thread1.join();
		
		System.out.println("State after completion: " + thread1.getState());
		
	}
}
