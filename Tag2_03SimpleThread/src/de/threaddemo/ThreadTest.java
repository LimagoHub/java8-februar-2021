package de.threaddemo;

public class ThreadTest {

	public static void main(String[] args) throws Exception{
		MyThread hund = new MyThread("Wau");
		MyThread katze = new MyThread("Miau");
		MyThread maus = new MyThread("Piep");
		
		
		Thread t1 = new Thread(hund);
		Thread t2 = new Thread(katze);
		Thread t3 = new Thread(maus);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
