package org.polymorphisim;

public class Employee {
    //Overloaded Method
	//calculateSalary - 1 argument
	public double calculateSalary(double baseSalary) {
		return baseSalary;
	}
	public double calculateSalary(int baseSalary) {
		return baseSalary;
	}
	//calculateSalary - 2 argument
	public double calculateSalary(double baseSalary, double bonus) {
		return baseSalary+bonus;
	}
	//calculateSalary - 3 argument
	public double calculateSalary(double baseSalary, double bonus, double allowance) {
		return baseSalary+bonus+allowance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		System.out.println("Base Salary : "+emp1.calculateSalary(50000));
		System.out.println("Base Salary and Bonus : "+ emp1.calculateSalary(50000,3000));
		System.out.println("BaseSalary,Bonus and allowance : "+emp1.calculateSalary(5000,3000,2000));

	}

}
//Employee -> Sr. Developer
//Business Manager
