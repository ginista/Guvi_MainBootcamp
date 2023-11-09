package org.Overriding;

public class Manager extends Employee{
	
	private double bonus;
	
	public Manager(String name, double baseSalary,double bonus) {
		super(name,baseSalary);
		this.bonus = bonus;
		
	}
	
	@Override
	public double calculateSalary() {
		//salary data for manager
		return getSalary()+bonus;
	}

}
