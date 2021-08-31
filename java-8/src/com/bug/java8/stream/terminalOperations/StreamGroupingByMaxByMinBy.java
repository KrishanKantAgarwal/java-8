package com.bug.java8.stream.terminalOperations;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class StreamGroupingByMaxByMinBy {

	public static void groupByMaxBy() {
		Map<Integer, Optional<Student>> studentMap = StudentDataBase.getAllStudents()
					.stream()
					.collect(Collectors.groupingBy(Student::getGradeLevel,
							Collectors.maxBy(Comparator.comparing(Student::getGpa))));
		
		System.out.println(studentMap);
	}
	
	public static void groupByMinBy() {
		Map<Integer, Optional<Student>> studentMap = StudentDataBase.getAllStudents()
					.stream()
					.collect(Collectors.groupingBy(Student::getGradeLevel,
							Collectors.minBy(Comparator.comparing(Student::getGpa))));
		
		System.out.println(studentMap);
	}
	
	public static void groupByMinByRemovingOptional() {
		Map<Integer, Student> studentMapWithoutOptional = StudentDataBase.getAllStudents()
					.stream()
					.collect(Collectors.groupingBy(Student::getGradeLevel,
							Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)), 
							Optional::get)));
		
		System.out.println(studentMapWithoutOptional);
	}
	
	public static void main(String[] args) {
		groupByMaxBy();
		System.out.println();
		groupByMinBy();
		System.out.println();
		groupByMinByRemovingOptional();
	}
}

//{2=Optional[Student [name=Jenny, gradeLevel=2, gpa=3.8, gender=female, activities=[swimming, gymnastics, soccer], noteBook=12]], 3=Optional[Student [name=Emily, gradeLevel=3, gpa=4.0, gender=female, activities=[swimming, gymnastics, aerobics], noteBook=13]], 4=Optional[Student [name=James, gradeLevel=4, gpa=3.9, gender=male, activities=[swimming, basketball, baseball, football], noteBook=16]]}

//{2=Optional[Student [name=Adam, gradeLevel=2, gpa=3.6, gender=male, activities=[swimming, basketball, volleyball], noteBook=11]], 3=Optional[Student [name=Dave, gradeLevel=3, gpa=3.9, gender=male, activities=[swimming, gymnastics, soccer], noteBook=14]], 4=Optional[Student [name=Sophia, gradeLevel=4, gpa=3.5, gender=female, activities=[swimming, dancing, football], noteBook=15]]}

//{2=Student [name=Adam, gradeLevel=2, gpa=3.6, gender=male, activities=[swimming, basketball, volleyball], noteBook=11], 3=Student [name=Dave, gradeLevel=3, gpa=3.9, gender=male, activities=[swimming, gymnastics, soccer], noteBook=14], 4=Student [name=Sophia, gradeLevel=4, gpa=3.5, gender=female, activities=[swimming, dancing, football], noteBook=15]}
