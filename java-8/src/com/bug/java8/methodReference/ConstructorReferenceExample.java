package com.bug.java8.methodReference;

import java.util.function.Function;
import java.util.function.Supplier;

import com.bug.java8.models.Student;

public class ConstructorReferenceExample {

	/**
	 * Student::new requires no-args constructor because Supplier does not accept any input
	 */
	static Supplier<Student> studentSupplier = Student::new;
	
	/**
	 * Student::new requires a one parameter constructor because we are passing String as an input
	 * and the return type is Student
	 */
	static Function<String, Student> studentFunction = Student::new;
	
	public static void main(String[] args) {
		System.out.println(studentSupplier.get());
		System.out.println(studentFunction.apply("John"));
	}
}
