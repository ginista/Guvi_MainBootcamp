package day15.org.functionalProgramming;

//use annotation to make it functional interface

@FunctionalInterface
public interface Calculator {
	//define a single abstract method
	//abstract method cannot have a body.
	int calculate(int num1,int num2);
	
	
	

}
