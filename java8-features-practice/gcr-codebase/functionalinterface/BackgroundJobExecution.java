package functionalinterface;

public class BackgroundJobExecution {
	public static void main(String[] args) {
		Runnable job1 = ()->{
			for(int i=0;i<10;i++) {
				System.out.println((char)(i+97));
			}
		};
		Runnable job2 = ()->{
			for(int i=0;i<10;i++) {
				System.out.println((char)(i+65));
			}
		};
		
		Thread thread1=new Thread(job1);
		Thread thread2=new Thread(job2);
		
		thread1.start();
		thread2.start();
	}
}
