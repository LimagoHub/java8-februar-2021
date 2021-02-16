package de.main;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import de.tiere.Kuh;

public class Main {

	public static void main(String[] args) {
		
		//Comparator<Kuh> c = (o1,o2) ->o1.getName().compareTo( o2.getName());
//		Comparator<Kuh> c = Comparator.comparingInt(kuh->kuh.getGewicht());
//		
//		c = c.reversed();
		
		Comparator<Kuh> c = Comparator.naturalOrder();
		c = c.thenComparing(Comparator.comparing(kuh->kuh.getName())).reversed();
		c = Comparator.nullsLast(c);
		
		
		Set<Kuh> kuehe = new TreeSet<>(c);
		
		kuehe.add(new Kuh("aaaaa",50));
		kuehe.add(new Kuh("ccccc",40));
		kuehe.add(new Kuh("bbbb",60));
		kuehe.add(new Kuh("ffff",60));
		kuehe.add(new Kuh("eee",60));
		kuehe.add(null);
		
		
		for (Kuh string : kuehe) {
			System.out.println(string);
		}
	}

}
