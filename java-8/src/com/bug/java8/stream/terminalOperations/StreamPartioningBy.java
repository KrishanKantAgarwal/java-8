package com.bug.java8.stream.terminalOperations;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class StreamPartioningBy {

	public static void partioningByOneLevel() {
		Map<Boolean, List<Student>> studentMap = StudentDataBase.getAllStudents()
					.stream()
					.collect(Collectors.partitioningBy((student) -> student.getGpa()>=3.8));
		
		System.out.println(studentMap);
	}
	
	public static void partioningByTwoLevel() {
		
		Predicate<Student> studentPredicate = (student) -> student.getGpa()>=3.8;
		
		Map<Boolean, Set<Student>> studentMap = StudentDataBase.getAllStudents()
					.stream()
					.collect(Collectors.partitioningBy(studentPredicate, Collectors.toSet()));
		
		System.out.println(studentMap);
	}
	
	public static void main(String[] args) {
		/**
		 * PartioningBy is same as groupingBy
		 * The key of the map will always be Boolean
		 */
		partioningByOneLevel();
		
		System.out.println();
		
		partioningByTwoLevel();
	}
	
}

//{false=[Student [name=Adam, gradeLevel=2, gpa=3.6, gender=male, activities=[swimming, basketball, volleyball], noteBook=11], Student [name=Sophia, gradeLevel=4, gpa=3.5, gender=female, activities=[swimming, dancing, football], noteBook=15]], true=[Student [name=Jenny, gradeLevel=2, gpa=3.8, gender=female, activities=[swimming, gymnastics, soccer], noteBook=12], Student [name=Emily, gradeLevel=3, gpa=4.0, gender=female, activities=[swimming, gymnastics, aerobics], noteBook=13], Student [name=Dave, gradeLevel=3, gpa=3.9, gender=male, activities=[swimming, gymnastics, soccer], noteBook=14], Student [name=James, gradeLevel=4, gpa=3.9, gender=male, activities=[swimming, basketball, baseball, football], noteBook=16]]}

//{false=[Student [name=Sophia, gradeLevel=4, gpa=3.5, gender=female, activities=[swimming, dancing, football], noteBook=15], Student [name=Adam, gradeLevel=2, gpa=3.6, gender=male, activities=[swimming, basketball, volleyball], noteBook=11]], true=[Student [name=James, gradeLevel=4, gpa=3.9, gender=male, activities=[swimming, basketball, baseball, football], noteBook=16], Student [name=Jenny, gradeLevel=2, gpa=3.8, gender=female, activities=[swimming, gymnastics, soccer], noteBook=12], Student [name=Emily, gradeLevel=3, gpa=4.0, gender=female, activities=[swimming, gymnastics, aerobics], noteBook=13], Student [name=Dave, gradeLevel=3, gpa=3.9, gender=male, activities=[swimming, gymnastics, soccer], noteBook=14]]}