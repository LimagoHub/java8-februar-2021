package de.integrata;

// SAM SingleAbstractMethod
@FunctionalInterface
public interface IDemo {
	
	double PI = 3.14;
	
	void foo();
	
	
	default void bar() {
		System.out.println("Hallo");
	}
	
	static void foobar() {
		System.out.println("Welt");
	}

}
