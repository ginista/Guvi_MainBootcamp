package org.Overriding;

public class Employee {
	
	private String name;
	private double baseSalary;
	
	public Employee(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return baseSalary;
	}
	public double calculateSalary() {
		return baseSalary;
	}
	

}
