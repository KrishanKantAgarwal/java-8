package com.bug.java8.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class StreamSortUsingComparator {

	public static List<Student> getSortedUsingComparatorStudentByName(){
		List<Student> sortedStudentByName = StudentDataBase.getAllStudents()
					.stream()
					.sorted(Comparator.comparing(Student::getName))
					.collect(Collectors.toList());
		
		return sortedStudentByName;
	}
	
	public static List<Student> getSortedUsingComparatorStudentByGPA(){
		List<Student> sortedStudentByGPA = StudentDataBase.getAllStudents()
					.stream()
					.sorted(Comparator.comparing(Student::getGpa))
					.collect(Collectors.toList());
		
		return sortedStudentByGPA;
	}
	
	public static List<Student> getSortedUsingComparatorStudentByGPAInDESC(){
		List<Student> sortedStudentByGPAInDESC = StudentDataBase.getAllStudents()
					.stream()
					.sorted(Comparator.comparing(Student::getGpa).reversed())
					.collect(Collectors.toList());
		
		return sortedStudentByGPAInDESC;
	}
	
	public static List<Student> getSortedUsingComparatorStudentByNameAndGPA(){
		List<Student> sortedStudentByNameAndGPA = StudentDataBase.getAllStudents()
					.stream()
					.sorted(Comparator.comparing(Student::getName).thenComparing(Student::getGpa))
					.collect(Collectors.toList());
		
		return sortedStudentByNameAndGPA;
	}
	
	public static void main(String[] args) {
		System.out.println("Sorting Student By Name");
		//System.out.println(getSortedUsingComparatorStudentByName());
		getSortedUsingComparatorStudentByName().forEach(System.out::println);
		
		System.out.println();
		System.out.println("Sorting Student By GPA");
		getSortedUsingComparatorStudentByGPA().forEach(System.out::println);
		
		System.out.println();
		System.out.println("Sorting Student By GPA in DESC");
		getSortedUsingComparatorStudentByGPAInDESC().forEach(System.out::println);
		
		System.out.println();
		System.out.println("Sorting Student By Name and GPA");
		getSortedUsingComparatorStudentByNameAndGPA().forEach(System.out::println);
	}

}
