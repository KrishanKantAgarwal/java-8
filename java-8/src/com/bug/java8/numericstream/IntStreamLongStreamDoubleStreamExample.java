package com.bug.java8.numericstream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class IntStreamLongStreamDoubleStreamExample {

	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("IntStream Range : ");
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
		System.out.println("IntStream range count: " + IntStream.range(1, 10).count());
		
		System.out.println();
		System.out.println("IntStream RangeClosed : ");
		IntStream.rangeClosed(1, 10).forEach(System.out::print);
		System.out.println();
		System.out.println("IntStream range closed count: " + IntStream.rangeClosed(1, 10).count());
		
		System.out.println();
		System.out.println("LongStream Range : ");
		LongStream.range(1, 10).forEach(System.out::print);
		System.out.println();
		System.out.println("LongStream range count: " + LongStream.range(1, 10).count());
		
		System.out.println();
		System.out.println("LongStream RangeClosed : ");
		LongStream.rangeClosed(1, 10).forEach(System.out::print);
		System.out.println();
		System.out.println("LongStream range closed count: " + LongStream.rangeClosed(1, 10).count());
		
		/**
		 * In Double Stream, we don't have range and rangeClosed method
		 * We can achieve the similar functionality of range and rangeClosed by using 
		 * asDoubleStream on IntStream or LongStream
		 */
		
		System.out.println();
		System.out.println("DoubleStream RangeClosed using asDoubleStream : ");
		IntStream.range(1, 10).asDoubleStream().forEach(System.out::print);
		System.out.println();
		System.out.println("DoubleStream range closed count using asDoubleStream: " 
		+ LongStream.rangeClosed(1, 10).asDoubleStream().count());
	}
}
