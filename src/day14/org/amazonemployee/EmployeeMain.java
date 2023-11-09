package day14.org.amazonemployee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp = Arrays.asList(
				new Employee("Lavish","Developer",10000),
				new Employee("Satish","Testing",8000),
				new Employee("Saidinesh","Manager",15000),
				new Employee("Arpita","Developer",5000)
				);

	//calculating salary
	double totalsalary = emp.stream()
			.mapToDouble(Employee::getSalary)
			.sum();
	System.out.println("Total Salary : "+totalsalary);
	
	//Find out all developer
	List<Employee> developer = emp.stream()
			.filter(e->e.getRole().equals("Developer"))
			.collect(Collectors.toList());
	developer.forEach(dev ->System.out.println(dev.getName()));
	
	emp.stream().filter(e->e.getRole().equals("Developer"))
			.forEach(dev ->System.out.println("Name :"+dev.getName()));
	
	//Using java stream 
	//Scenario ->We providing 10% bonus to all the developer
	emp.stream().filter(e->e.getRole().equals("Developer"))
	.forEach(dev ->dev.setSalary((double)dev.getSalary()*1.1));
	
	//display the updated salary
	emp.forEach(emp1->System.out.println("Name : "+emp1.getName()+",Role:"+emp1.getRole()+", Salary :"+emp1.getSalary()));
	}
	
}
