package de.bank;

import static java.lang.Thread.sleep;

public class Bank {
	
	private final int konten[] = { 30, 50, 100 };
	
	
	public void kontostand() {
		
		for (int i = 0; i < konten.length; i++) {
			System.out.println("Konto Nr. " + i + " hat den Saldo "+ konten[i]);
			
		}
		System.out.println("---------------------------------");
	}
	
	
	public synchronized void ueberweisen(int von, int nach, int betrag) {
		
			int zettel = konten[von];
			zettel -= betrag;
			try {
				sleep((long) (Math.random() * 2000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			konten[von] = zettel;
			konten[nach] += betrag;
			kontostand();
		
	}

}
