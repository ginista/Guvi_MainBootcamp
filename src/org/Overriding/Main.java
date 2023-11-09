package org.Overriding;
//For overriding minimum 2 classes are required.
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an object of employee class
		Employee emp1 = new Employee("Ginista",50000);
		//Using EMployee class reference manager class construcotr 
		Employee emp2 = new Manager("Antanin",80000,10000);
		Employee emp3 = new Engineer("Sheela",50000,20000);
		System.out.println(emp1.getName()+" Salary : "+emp1.calculateSalary());
        System.out.println(emp2.getName()+" Salary: "+emp2.calculateSalary());
        System.out.println(emp3.getName()+" Salary: "+emp3.calculateSalary());
	}

}
