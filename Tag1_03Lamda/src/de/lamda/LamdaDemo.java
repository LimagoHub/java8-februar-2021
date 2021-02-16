package de.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LamdaDemo {

	public static void main(String[] args) {
		new LamdaDemo().run();
	}

	
	private void run() {
		System.out.println(go(10).apply("Hallo"));
	}
	
	private Function<String, Integer> go(final int myValue ) {
		
		//final int myValue = 10;  // effective final
		
		Function<String, Integer> function = s->s.length() + myValue;
		
		
		
		return function;
		
		
		
	}
	
	
	
	
	
	
	

}
