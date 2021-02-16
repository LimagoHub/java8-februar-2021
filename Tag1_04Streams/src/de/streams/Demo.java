package de.streams;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		new Demo().run();

	}

	private void run() {

//		IntStream stream = IntStream.rangeClosed(1, 100_000);
//		stream.filter(this::isPrime).forEach(System.out::println);
		
//		IntStream stream = IntStream.rangeClosed(-3, 3);
//		
//		stream.map(n->n*n).distinct().forEach(System.out::println);
		
		
//		IntStream stream = IntStream.rangeClosed(-30, 3);
//		System.out.println(stream.peek(System.out::println).sum());
//		;
		
		
//		Stream<String> stringsttream = Stream.of("eins", "zwei","drei","vier");
//		
//		List<String> treffer = stringsttream.filter(s->s.endsWith("ei")).collect(Collectors.toList());
		
//		double average = IntStream.rangeClosed(1, 1_000).filter(this::isPrime).average().getAsDouble();
//		System.out.println(average);
		
// 		IntStream.rangeClosed(1, 1_000).filter(this::isPrime).mapToObj(Integer::valueOf).sorted(Collections.reverseOrder()).forEach(System.out::println);
		

		IntStream.iterate(1, v->v*2).limit(10).forEach(System.out::println);
		//Stream.of("eins", "zwei","drei","vier").collect(Collectors.toList())
	}
	
	
	private boolean isPrime(int possiblePrime) {
		for(int divider = 2 ; divider <= possiblePrime/2 ; divider ++ ) {
			if(possiblePrime % divider == 0)
				return false;
		}
		
		return true;
	}
	
	

}
