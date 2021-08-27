package com.bug.java8.parallelstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {

	public static int sequentialSum(List<Integer> integerList) {
		long startTime = System.currentTimeMillis();
		int result = integerList
						.stream()
						.reduce(0, Integer::sum);
		long endTime = System.currentTimeMillis();
		System.out.println("Duration in sequential stream : "+ (endTime - startTime));
		return result;
	}
	
	public static int parallelSum(List<Integer> integerList) {
		long startTime = System.currentTimeMillis();
		int result = integerList
						.parallelStream()//More effort will be taken to un-boxing Integer to int
						.reduce(0, Integer::sum);
		long endTime = System.currentTimeMillis();
		System.out.println("Duration in parallel stream : "+ (endTime - startTime));
		return result;
	}
	
	public static void main(String[] args) {
		List<Integer> integerList = IntStream.rangeClosed(0, 100000)
											.boxed()
											.collect(Collectors.toList());
		
		sequentialSum(integerList);
		parallelSum(integerList);
		
	}
}
