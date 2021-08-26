package com.bug.java8.functionalInterface;

import java.util.List;
import java.util.function.Predicate;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class PredicateExample {

	static List<Student> studentList = StudentDataBase.getAllStudents();
	
	static Predicate<Integer> predicate1 = (i) -> i % 2 == 0;
	static Predicate<Integer> predicate2 = (i) -> i % 5 == 0;
	
	static Predicate<Student> predicate3 = (student) -> student.getGradeLevel()>=3;
	static Predicate<Student> predicate4 = (student) -> student.getGpa()>=3.9;
	
	public static void filterStudentByGradeAndGpa() {
		System.out.println();
		System.out.println("filterStudentByGradeAndGpa: *******************************");
		
		studentList.forEach((student -> {
			if(predicate3.and(predicate4).test(student)) {
				System.out.println(student);
			}
		}));
	}
	
	public static void filterStudentByGradeOrGpa() {
		System.out.println();
		System.out.println("filterStudentByGradeOrGpa: *******************************");
		
		studentList.forEach((student -> {
			if(predicate3.or(predicate4).test(student)) {
				System.out.println(student);
			}
		}));
	}
	
	public static void filterStudentByGradeNegateGpa() {
		System.out.println();
		System.out.println("filterStudentByGradeNegateGpa: *******************************");
		
		studentList.forEach((student -> {
			if(predicate3.or(predicate4).negate().test(student)) {
				System.out.println(student);
			}
		}));
	}
	
	public static void main(String[] args) {
		System.out.println(predicate1.test(8));
		System.out.println("Predicate AND : " + predicate1.and(predicate2).test(10));
		System.out.println("Predicate AND : " + predicate1.and(predicate2).test(15));
		System.out.println("Predicate OR : " + predicate1.or(predicate2).test(10));
		System.out.println("Predicate OR : " + predicate1.or(predicate2).test(15));
		System.out.println("Predicate NEGATE : " + predicate1.or(predicate2).negate().test(15));
		
		filterStudentByGradeAndGpa();
		filterStudentByGradeOrGpa();
		filterStudentByGradeNegateGpa();
	}
}
