package org.Overriding;

public class Engineer extends Employee {
 
 private double overTimePay;
 
 public  Engineer(String name,double baseSalary,double overTimePay) {
	 super(name, baseSalary);
	 this.overTimePay = overTimePay;
 }
 @Override
 public double calculateSalary() {
	 return getSalary()+overTimePay;
 }
}
