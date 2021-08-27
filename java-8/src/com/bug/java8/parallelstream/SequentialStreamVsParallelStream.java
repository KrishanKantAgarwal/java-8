package com.bug.java8.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SequentialStreamVsParallelStream {

	public static long checkPerformance(Supplier<Integer> supplier, int noOfTimes) {
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < noOfTimes; i++) {
			supplier.get();
		}
		long endTime = System.currentTimeMillis();
		return endTime-startTime;
	}
	
	//Sequential Stream
	public static int sumSequentialStream() {
		return IntStream.rangeClosed(0, 100000).sum();
	}
	
	//Parallel Stream	
	public static int sumParallelStream() {
		return IntStream.rangeClosed(0, 100000).parallel().sum();
	}
	
	public static void main(String[] args) {
		System.out.println("No. of processors in this machine : "+ Runtime.getRuntime().availableProcessors());
		System.out.println("Sequential Stream : " + checkPerformance(SequentialStreamVsParallelStream::sumSequentialStream, 20));
		System.out.println("Parallel Stream : " + checkPerformance(SequentialStreamVsParallelStream::sumParallelStream, 20));
	}
}
