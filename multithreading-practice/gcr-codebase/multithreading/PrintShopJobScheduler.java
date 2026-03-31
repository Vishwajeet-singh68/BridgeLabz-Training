package multithreading;

class PrintJob implements Runnable{
	String jobName;
	int pages;
	int priority;
	String priorityLevel;
	public PrintJob(String jobName, int pages, int priority) {
		this.jobName = jobName;
		this.pages = pages;
		this.priority = priority;
		priorityLevel = (priority>5)?"High":(priority==5 || priority==6)?"Medium":"Low";
	}
	@Override
	public void run() {
		
		for(int i=1;i<=pages;i++) {
			System.out.println("["+priorityLevel+" Priority] Printing "+jobName+" - Page "+i+"of "+pages);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class PrintShopJobScheduler{
	public static void main(String[] args) throws InterruptedException{
		Thread t1 = new Thread(new PrintJob("job1",10,5));
		Thread t2 = new Thread(new PrintJob("job2",5,8));
		Thread t3 = new Thread(new PrintJob("job3",15,3));
		Thread t4 = new Thread(new PrintJob("job4",8,6));
		Thread t5 = new Thread(new PrintJob("job5",12,7));
						
		t1.setPriority(5);
		t2.setPriority(8);
		t3.setPriority(3);
		t4.setPriority(6);
		t5.setPriority(7);
		
		System.out.println("Starting print job ...");
		long start = System.currentTimeMillis();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		
		System.out.println("All jobs completed in: "+(System.currentTimeMillis()-start));
	}
}
