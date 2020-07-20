package main;

public class Person extends Thread {
	
	@Override
	public void run() {
		
		for (int i = 0; i < 30; i++) {
			System.out.println("printing"+i);
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			System.out.println("i am interrupted");
		}
	}
	
}
