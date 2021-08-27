package com.bug.java8.methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

	static Function<String, String> functionUsingLambda = (s) -> s.toLowerCase();
	static Function<String, String> functionUsingMethodReference = String::toLowerCase;
	
	public static void main(String[] args) {
		System.out.println(functionUsingLambda.apply("USINGLAMBDA"));
		System.out.println(functionUsingLambda.apply("USINGMETHODREFERENCE"));
	}
}
