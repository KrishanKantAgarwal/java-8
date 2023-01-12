package com.bug.java8.functionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	/**
	 * We use Binary Operator when the both the inputs are same and also output is same data type
	 * It extends BiFunction<T t, R r, U u> functional interface
	 */
	static Comparator<Integer> comparator = (i1, i2) -> i1.compareTo(i2);
	static BinaryOperator<Integer> binaryOperator1 = (i1, i2) -> i1 * i2;
	static BinaryOperator<Integer> binaryOperator2 = BinaryOperator.maxBy(comparator);
	static BinaryOperator<Integer> binaryOperator3 = BinaryOperator.minBy(comparator);
	
	public static void main(String[] args) {
		System.out.println(binaryOperator1.apply(91, 9));
		System.out.println(binaryOperator2.apply(100, 99));
		System.out.println(binaryOperator3.apply(10, 19));
	}
}
