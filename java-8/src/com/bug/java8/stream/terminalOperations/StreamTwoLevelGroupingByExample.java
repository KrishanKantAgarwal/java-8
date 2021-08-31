package com.bug.java8.stream.terminalOperations;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class StreamTwoLevelGroupingByExample {

	public static void groupByUsingGroupingBy() {
		Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.groupingBy((student) -> student.getGpa()>=3.8 ? "OUTSTANDING" : "AVERAGE")));
		
		System.out.println(studentMap);
	}
	
	public static void groupByUsingDifferentCollectors() {
		Map<String,Integer> studentMap = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getName,
						Collectors.summingInt(Student::getNoteBook)));
		
		System.out.println(studentMap);
	}
	
	public static void main(String[] args) {
		
		groupByUsingGroupingBy();
		//{2={AVERAGE=[Student [name=Adam, gradeLevel=2, gpa=3.6, gender=male, activities=[swimming, basketball, volleyball], noteBook=11]], OUTSTANDING=[Student [name=Jenny, gradeLevel=2, gpa=3.8, gender=female, activities=[swimming, gymnastics, soccer], noteBook=12]]}, 
		//3={OUTSTANDING=[Student [name=Emily, gradeLevel=3, gpa=4.0, gender=female, activities=[swimming, gymnastics, aerobics], noteBook=13], Student [name=Dave, gradeLevel=3, gpa=3.9, gender=male, activities=[swimming, gymnastics, soccer], noteBook=14]]}, 
		//4={AVERAGE=[Student [name=Sophia, gradeLevel=4, gpa=3.5, gender=female, activities=[swimming, dancing, football], noteBook=15]], OUTSTANDING=[Student [name=James, gradeLevel=4, gpa=3.9, gender=male, activities=[swimming, basketball, baseball, football], noteBook=16]]}}
		
		System.out.println();
		
		groupByUsingDifferentCollectors();//{Adam=11, Emily=13, James=16, Dave=14, Jenny=12, Sophia=15}
	}
}
