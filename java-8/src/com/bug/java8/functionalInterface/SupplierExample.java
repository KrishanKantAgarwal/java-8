package com.bug.java8.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class SupplierExample {

	/**
	 * Supplier does not take any input () -> {"NO INPUT"}
	 * and return the type
	 */
	static Supplier<Student> studentSupplier = () -> {
		return new Student("Dave",3,3.9,"male", Arrays.asList("swimming", "gymnastics","soccer")); 
	};
	
	static Supplier<List<Student>> studentListSupplier = () -> StudentDataBase.getAllStudents();
	
	static Supplier<String> stringSupplier = () -> "Functional Interface Complete";
	
	public static void main(String[] args) {
		System.out.println(studentSupplier.get());
		System.out.println(studentListSupplier.get());
		System.out.println(stringSupplier.get());
	}
}
