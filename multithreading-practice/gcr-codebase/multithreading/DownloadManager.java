package multithreading;

import java.util.*;
class DownloadThread extends Thread {
	String fileName;
	
	DownloadThread(String fileName){
		this.fileName = fileName;
	}
	
	@Override
	public void run(){
		Random random = new Random();
		for(int i = 1;i<=100;i+=5) {
			System.out.println("["+Thread.currentThread().getName()+"]"
					+ " Downloading "+fileName+": "+i+"%");
			try {
				Thread.sleep(random.nextInt(100,300));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class DownloadManager{
	public static void main(String[] args) throws InterruptedException {
		
		DownloadThread document = new DownloadThread("Document.pdf");
		DownloadThread image = new DownloadThread("Image.png");
		DownloadThread video = new DownloadThread("Vido.mp4");
		
		
		document.start();
		image.start();
		video.start();
		
		document.join();
		image.join();
		video.join();
		
		System.out.println("All download complete");
	}
}
