package de.demo;

import java.util.function.Consumer;

public class Uebung {
	
	private final String feld [] = {"eins","zwei","drei","vier"};
	private int index = 0;
	private Consumer<String> consumer = null;
	
	public Uebung() {
		// TODO Auto-generated constructor stub
	}
	
	public Uebung(Consumer<String> consumer) {  // void xx(String value)  
		this.consumer = consumer;
	}
	
	public String getActualValue() {
		return feld [index];
	}
	
	public void nextValue() {
		index ++;
		index %= feld.length;
		if(consumer != null)
			consumer.accept(getActualValue());
	}

}
