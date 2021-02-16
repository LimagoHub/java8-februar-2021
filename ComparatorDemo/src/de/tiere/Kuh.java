package de.tiere;

import static java.lang.Thread.sleep;

public class Kuh implements Comparable<Kuh>{
	
	private String name;
	private int gewicht;
	
	
	public Kuh() {
		this("Elsa", 50);
	}
	
	public Kuh(String name , int gewicht) {
		this.gewicht = gewicht;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGewicht() {
		return gewicht;
	}

	
	public void fressen() {
				
		new Thread(this::fressenImpl).start();
	}

	private void fressenImpl() {
		try {
			sleep((long) (Math.random() * 3000));
			
			gewicht ++;
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Kuh [name=" + name + ", gewicht=" + gewicht + "]";
	}

	@Override
	public int compareTo(Kuh other) {
		
		return gewicht - other.gewicht;
	}
	

}
