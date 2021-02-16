package de.threads;

import java.util.concurrent.CompletableFuture;

public class Demo {

	public static void main(String[] args) throws Exception{
		
		Pair pair = new Pair(3.0, 4.0);
		
		final CompletableFuture<Pair> f1 = CompletableFuture.supplyAsync(()->pair);
		final CompletableFuture<Double> f2 = f1.thenApply(p -> p.x * p.x);
		final CompletableFuture<Double> f3 = f1.thenApply(p -> p.y * p.y);
		final CompletableFuture<Double> f4 = f2.thenCombine(f3, (a,b)->Math.sqrt(a + b));
		double ergebnis = f4.get();
		
		System.out.println(ergebnis);

	}

	static class Pair {
		public final double x;
		public final double y;
		public Pair(final double x, final double y) {
			
			this.x = x;
			this.y = y;
		}
		
		
	}
}
