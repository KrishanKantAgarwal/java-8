package com.bug.java8.parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamIssueWithMutableObject {
	
	public static void main(String[] args) {
		Sum sum = new Sum();
		
//		IntStream.rangeClosed(0, 1000)
//				.forEach(sum::performSum);
//		
//		System.out.println(sum.getTotal()); //500500
		
		/**
		 * The parallel stream will not work properly with the mutable object.
		 * As the thread will modify the total value here, and the output will not be 500500.
		 * When ever you will run it, there will be new output in case of parallel stream.
		 */
		IntStream.rangeClosed(0, 1000)
				.parallel()
				.forEach(sum::performSum);
		
		System.out.println(sum.getTotal()); //468544
	}
}
