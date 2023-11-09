package day14.org.amazonemployee;


public class Employee {
   //create a data members private
	private String name;
	private String role;
	private double salary;
	
	//create a constructor and initialize a data member
	public Employee(String name, String role,double salary) {
		//set the data.
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	
	//create a getter method
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
