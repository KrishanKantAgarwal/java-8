package com.bug.java8.stream;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class StreamMapReduceExample {

	//Using reduce
	public static int noOfNoteBooks() {
		int count = StudentDataBase.getAllStudents().stream()
				.map(Student::getNoteBook)
				.reduce(0, (a, b) -> a + b );
		
		return count;
	}
	
	//Different way of performing sum using Integer::sum
	public static int noOfNoteBooksUsingIntegerSum() {
		int count = StudentDataBase.getAllStudents().stream()
				.map(Student::getNoteBook)
				.reduce(0, Integer::sum);
		
		return count;
	}
	
	//Using filter, map, reduce
	public static int noOfNoteBooksForFemaleStudent() {
		int count = StudentDataBase.getAllStudents().stream()
				.filter((student) -> student.getGender().equals("female"))
				.map(Student::getNoteBook)
				.reduce(0, Integer::sum);
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println("Using Reduce: ");
		System.out.println(noOfNoteBooks());
		
		System.out.println();
		System.out.println("Using Reduce and Integer::sum : ");
		System.out.println(noOfNoteBooksUsingIntegerSum());
		
		System.out.println();
		System.out.println("No.of notebooks with female student using map, filter, reduce: ");
		System.out.println(noOfNoteBooksForFemaleStudent());
	}
}
