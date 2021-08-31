package com.bug.java8.numericstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamRangeClosedExample {

	public static int sumOfNNumbersUsingStream(List<Integer> integerList) {
		return integerList.stream()
				//It will pass Integer value. 
				//so under hood the JVM will have to perform un-boxing of converting Integer to int
				//every time, it pass the value.
				.reduce(0, (x,y)-> x+y);
	}
	
	public static int sumOfNNumbersUsingIntStream() {
		return IntStream.rangeClosed(1, 6)
				.sum();
	}
	
	public static void main(String[] args) {
		System.out.println("Using Stream : ");
		System.out.println(sumOfNNumbersUsingStream(Arrays.asList(1,2,3,4,5,6)));
		
		System.out.println();
		System.out.println("Using IntStream : ");
		System.out.println(sumOfNNumbersUsingIntStream());
	}
}
