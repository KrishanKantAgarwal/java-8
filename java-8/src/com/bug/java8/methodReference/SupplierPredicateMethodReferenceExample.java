package com.bug.java8.methodReference;

import java.util.function.Predicate;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class SupplierPredicateMethodReferenceExample {

	static Predicate<Student> studentPredicate = SupplierPredicateMethodReferenceExample::greaterThan3GradeLevel;
	
	public static boolean greaterThan3GradeLevel(Student s) {
		return s.getGradeLevel() > 3;
	}
	
	public static void main(String[] args) {
		System.out.println(studentPredicate.test(StudentDataBase.studentSupplier.get()));
	}
}
