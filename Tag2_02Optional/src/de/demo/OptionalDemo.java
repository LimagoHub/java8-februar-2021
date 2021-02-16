package de.demo;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {

		//Optional<String> opt = Optional.of("Fritz");
		//Optional<String> opt = Optional.empty();
		
		String fritz = "Fritz";
		Optional<String> opt = Optional.ofNullable(fritz);
		
		Object erg = opt.map(t->t.length());
		System.out.println(((Optional) erg).get());
		

	}

}
