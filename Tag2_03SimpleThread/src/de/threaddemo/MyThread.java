package de.threaddemo;


import static java.lang.Thread.sleep;

public class MyThread extends Object implements Runnable{
	
	
	private final String message;

	public MyThread(final String message) {
		this.message = message;
	}
	

	@Override
	public void run() {
		
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(message);
				sleep((long) (Math.random() * 1000));
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
