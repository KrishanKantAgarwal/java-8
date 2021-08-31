package com.bug.java8.stream;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {

	public static void main(String[] args) {
		
		System.out.println("Stream of : ");
		Stream<String> stringStream = Stream.of("Adam", "Anee", "Krishan");
		stringStream.forEach(System.out::println);
		
		System.out.println();
		System.out.println("Stream Iterate : ");
		Stream.iterate(2, x -> x * 2)
			.limit(10)
			.forEach(System.out::println);//2,4,8,16,32,64,128,256,512,1024
		
		System.out.println();
		System.out.println("Stream Generate : ");
		Supplier<Integer> supplier = new Random()::nextInt;
		Stream.generate(supplier)
				.limit(5)
				.forEach(System.out::println);
			
		
		
	}
}
