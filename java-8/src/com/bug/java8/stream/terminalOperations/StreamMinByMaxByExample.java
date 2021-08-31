package com.bug.java8.stream.terminalOperations;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class StreamMinByMaxByExample {

	/**
	 * Min By will always take comparator and return the Object, here student
	 * Here it will return the lowest GPA student
	 * @return
	 */
	public static Optional<Student> minByGPA(){
		return StudentDataBase.getAllStudents()
						.stream()
						.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}
	
	/**
	 * Max By will always take comparator and return the Object, here student
	 * Here it will return the highest GPA student
	 * @return
	 */
	public static Optional<Student> maxByGPA(){
		return StudentDataBase.getAllStudents()
						.stream()
						.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static void main(String[] args) {
		System.out.println(minByGPA());
		System.out.println(maxByGPA());
	}
}
