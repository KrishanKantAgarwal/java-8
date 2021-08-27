package com.bug.java8.methodReference;

import java.util.List;
import java.util.function.Consumer;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class ConsumerMethodReferenceExample {

	static Consumer<Student> usingLambda = (student) -> System.out.println(student);
	
	static Consumer<Student> usingMethodeReference = System.out::println;
	
	static Consumer<List<String>> studentActivitiesUsingLambda = (activity) -> System.out.println(activity);
	
	static Consumer<List<String>> studentActivitiesUsingMethodReference = System.out::println;
	
	//Created a method inside a Student class. class-name::instance-method-name
	static Consumer<Student> studentActivitiesUsingMethodReferenceOfStudentClass = Student::printActivities;
	
	public static void main(String[] args) {
		System.out.println();
		StudentDataBase.getAllStudents().forEach(usingLambda);
		
		System.out.println();
		StudentDataBase.getAllStudents().forEach(usingMethodeReference);
		
		System.out.println();
		StudentDataBase.getAllStudents().forEach((student) -> {
			studentActivitiesUsingLambda.accept(student.getActivities());
		});
		
		System.out.println();
		StudentDataBase.getAllStudents().forEach((student) -> {
			studentActivitiesUsingMethodReference.accept(student.getActivities());
		});
		
		System.out.println();
		StudentDataBase.getAllStudents().forEach(studentActivitiesUsingMethodReferenceOfStudentClass);
	}
}
