package com.bug.java8.functionalInterface;

import java.util.List;
import java.util.function.Consumer;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class ConsumerExample {

	static Consumer<Student> c1 = (student) -> System.out.println(student);
	static Consumer<Student> c2 = (student) -> System.out.println(student.getName());
	static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());
	static List<Student> students = StudentDataBase.getAllStudents();
	
	public static void printStudents() {
		students.forEach(c1);
	}
	
	public static void printStudentsName() {
		students.forEach(c2);
	}
	
	public static void printStudentsNameAndActivities() {
		students.forEach(c2.andThen(c3));
	}
	
	public static void printStudentsNameAndActivitiesUsingCondition() {
		students.forEach((student) -> {
			if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
				c2.andThen(c3).accept(student);
			}
		});
	}
	
	public static void main(String[] args) {
		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
		c1.accept("krishan");
		
		System.out.println("**************************************");
		System.out.println();
		printStudents();
		
		System.out.println("**************************************");
		System.out.println();
		printStudentsName();
		
		System.out.println("**************************************");
		System.out.println();
		printStudentsNameAndActivities();
		
		System.out.println("**************************************");
		System.out.println();
		printStudentsNameAndActivitiesUsingCondition();
	}
}
