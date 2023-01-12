package com.bug.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class StreamDistinctCountSorted {

	public static List<String> getDistinctStudentActivities(){
		List<String> distinctStudentActivities = StudentDataBase.getAllStudents()
					.stream()
					.map(Student::getActivities)
					.flatMap(List::stream)
					.distinct()
					.collect(Collectors.toList());
		
		return distinctStudentActivities;
	}
	
	public static List<String> getSortedDistinctStudentActivities(){
		List<String> sortedDistinctStudentActivities = StudentDataBase.getAllStudents()
					.stream()
					.map(Student::getActivities)
					.flatMap(List::stream)
					.distinct()
					.sorted()
					.collect(Collectors.toList());
		
		return sortedDistinctStudentActivities;
	}
	
	public static long getCountOfDistinctStudentActivities(){
		long countOfdistinctStudentActivities = StudentDataBase.getAllStudents()
					.stream()
					.map(Student::getActivities)
					.flatMap(List::stream)
					.distinct()
					.count();
		
		return countOfdistinctStudentActivities;
	}
	
	public static void main(String[] args) {
		System.out.println("Distinct Student Activities");
		System.out.println(getDistinctStudentActivities());
		
		System.out.println();
		System.out.println("Sorted Distinct Student Activities");
		System.out.println(getSortedDistinctStudentActivities());
		
		System.out.println();
		System.out.println("Count Sorted Distinct Student Activities");
		System.out.println(getCountOfDistinctStudentActivities());
	}

}
