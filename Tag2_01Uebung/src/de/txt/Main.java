package de.txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static java.util.function.Function.*;

public class Main {

	public static void main(String[] args) {
		 new Main().run();
	}

	private void run() {
		String fileName = "CBS.log";

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

           stream
           .collect(Collectors.joining("\n"))
           .chars()
           .mapToObj(i->Character.valueOf((char) i))
           .collect(groupingBy(identity(),counting() ))
           .forEach((k,v)->System.out.printf("Char = '%s' Anzahl = %s\n", k,v));
           
           

        } catch (IOException e) {
            e.printStackTrace();
        }

		
	}

}
