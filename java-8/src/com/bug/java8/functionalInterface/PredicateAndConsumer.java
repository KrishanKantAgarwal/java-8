package com.bug.java8.functionalInterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class PredicateAndConsumer {

	static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
	static Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;
	
	BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);
	
	Consumer<Student> studentConsumer = (student) -> {

		if(p1.and(p2).test(student)) {
			studentBiConsumer.accept(student.getName(), student.getActivities());
		}
	};	
	
	public void printStudentNameAndActivities(List<Student> students) {
		students.forEach(studentConsumer);
	}
	
	public static void main(String[] args) {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		new PredicateAndConsumer().printStudentNameAndActivities(studentList);
	}

}
