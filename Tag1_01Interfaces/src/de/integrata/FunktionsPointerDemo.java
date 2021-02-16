package de.integrata;

public class FunktionsPointerDemo {

	public static void main(String[] args) {
		new FunktionsPointerDemo().run();
	}

	private void run() {
		
		int ergebnis = this.sinnDesLebens();
		System.out.println(ergebnis);
		
		DemoInterface myPointer = this::sinnDesLebens;
		
		int ergebnis2 = myPointer.bar();
		System.out.println(ergebnis2);
		
		
		myPointer = new DemoInterface() {
			
			@Override
			public int bar() {
				
				return sinnDesLebens();
			}
		};
		
		ergebnis2 = myPointer.bar();
		System.out.println(ergebnis2);
		
		
		
		
		
	}
	
	private int sinnDesLebens() {
		return 42;
	}

}

// SAM
@FunctionalInterface
interface DemoInterface {
	int bar();
	
}
