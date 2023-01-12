package com.bug.java8.codingpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PerformConcatenationOnTwoStream {

	public static void main(String[] args) {
		List<Integer> integerList1 = Arrays.asList(1,2,3,4);
        List<Integer> integerList2 = Arrays.asList(5,6,7);
        
        Stream<Integer> stream = Stream
        		.concat(integerList1.stream(), integerList2.stream());
        
        stream.forEach(System.out::print);
	}
}
