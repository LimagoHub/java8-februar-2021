package de.demo;

import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		
		Consumer<String> consumer = System.out::println;
		consumer = consumer.andThen(System.out::println);
		
		
		Uebung uebung = new Uebung(consumer);
		
		for (int i = 0; i < 5 ; i++) {
			uebung.nextValue();
			
		}
	}

}
