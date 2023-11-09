package day_13.org.setInterface;

import java.util.TreeSet;

public class StudentDetail {

	public static void main(String[] args) {
		//create an object of Treeset
		TreeSet<Student> std = new TreeSet<>();
		//sorted set
		std.add(new Student(101,"Sarath"));
		std.add(new Student(103,"Sumanth"));
		std.add(new Student(102,"Jenny"));
		std.add(new Student(102,"Sumanth"));// duplicate data
		
		//create a student reference
		Student stdcheck = new Student(102,"Jenny");
		if(std.contains(stdcheck)) {
			System.out.println("Student is available "+stdcheck.getName());
		}
		else {
			System.out.println("Student is not available "+stdcheck.getName());
		}
		
		//print details
		for(Student student:std) {
			System.out.println(student);
		}
		System.out.println("Total student :" +std.size());
	}

}
