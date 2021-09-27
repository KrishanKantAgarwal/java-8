package com.bug.java8.functionalInterface;

import java.util.function.Function;

public class FunctionExample {

	static Function<String, String> function1 = (name) -> name.toUpperCase();
	static Function<String, String> function2 = (name) -> name.toUpperCase().concat("kant");
	
	public static void main(String[] args) {
		
		System.out.println("Function apply: ");
		String result = function1.apply("krishan");
		System.out.println(result);
		
		System.out.println();
		System.out.println("Function andThen: ");
		String result1 = function1.andThen(function2).apply("Krishan");
		System.out.println(result1);
		
		System.out.println();
		System.out.println("Function compose: ");
		String result2 = function1.compose(function2).apply("Krishan");
		System.out.println(result2);
		
		System.out.println();
		System.out.println("Function compose and andThen: "); 
		//If compose and andThen both are used, compose will run first
		String result3 = function1.andThen(function2).compose(function2).apply("Krishan");
		System.out.println(result3);
	}
}
