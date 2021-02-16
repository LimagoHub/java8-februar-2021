package de.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

	public static void main(String[] args) throws Exception{
		
//		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
//		
//		for(int i = 0 ; i < 20 ; i ++)
//			service.execute(ThreadPoolDemo::longRunner);
//		
//		service.shutdown();
//		service.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
//		System.out.println("Fertisch!");
		
		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		Future<Integer> f1 = service.submit(ThreadPoolDemo::sinndesLebens);
		Future<Integer> f2 = service.submit(ThreadPoolDemo::sinndesLebens);
		
		service.shutdown();
		
		int ergebnis1 = f1.get();
		int ergebnis2 = f2.get();
		
		System.out.println(ergebnis1 + " " + ergebnis2);
		
	}

	
	public static void longRunner() {
		try {
			Thread.sleep((long) (Math.random() * 2000));
			System.out.println(Thread.currentThread().getId() + " hallo");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	static class MyCallable implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {
			
			return sinndesLebens();
		}
		
	}
	
	
	public static int sinndesLebens() {
		try {
			Thread.sleep((long) (Math.random() * 2000));
			return 42 + (int)  Thread.currentThread().getId();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}
	
	
}
