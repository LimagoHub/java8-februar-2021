package de.zeit;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;

public class ZeitDemo {

	public static void main(String[] args) throws Exception{
		
		Period p = Period.ofYears(1).withMonths(13);
		
		System.out.println(p);
		
		System.out.println(p.normalized());
	}

}
