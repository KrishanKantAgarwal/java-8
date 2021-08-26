package com.bug.java8.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class UnaryOperatorExample {

	/**
	 * When the operand and operator are of same type we should use Unary operator. 
	 * It extends Function<T t, R r> functional interface
	 */
	static UnaryOperator<List<Student>> studentsUnary = (students) -> {
		List<Student> studentList = new ArrayList<>();
		students.forEach((student) -> {
			if(PredicateAndConsumer.p1.test(student)) {
				System.out.println(student.getName());
				studentList.add(student);
			}
		});
		return studentList;
	};
	
	public static void main(String[] args) {
		List<Student> resultantStudent = studentsUnary.apply(StudentDataBase.getAllStudents());
		System.out.println(resultantStudent);
	}
}
