package Day_7.inheritance;
//Observe code reusability
class Person{
	//create 3 data members in class Person
	protected String name;
	protected int age;
	protected String address;
	//costructor
	public Person(String name, int age, String address) {
		//Initialize all members
		System.out.println("Person constructor executes");
		this.name = name;
		this.age = age;
		this.address = address;
	}
	//method to get the details
	public void printDetails() {
		System.out.println("Name "+this.name);
		System.out.println("Age "+this.age);
		System.out.println("Address "+this.address);
	}
}

class Employee extends Person{
	private int employeeId;
	private double baseSalary;
	private double bonus;
	private int pincode;
	
	//constructor-employee
	public Employee(String name, int age, String address, int employeeId,double baseSalary, double bonus, int pincode) {
		super(name,age,address);
		System.out.println("Employee constructor executed");
		this.employeeId = employeeId;
		this.baseSalary = baseSalary;
		this.bonus = bonus;
		this.pincode = pincode;
	}
	//method to calculate total salary
	public double calculateTotalSalary() {
		//logic Implementation
		return baseSalary + bonus;
	}
	//overriding the printDetails method in Employee
	@Override
	public void printDetails() {
		super.printDetails();//it will access name, age and address from person class
		System.out.println("Employee Id "+employeeId);
		System.out.println("Base Salary "+baseSalary);
		System.out.println("Employee Incentives "+bonus);
		System.out.println("Total Salary: "+calculateTotalSalary());
		System.out.println("Pincode: "+pincode);
	}
}
public class Main {
	
	public static void main(String args[])
	{
		//create an object
		Employee emp1 = new Employee("Satish",23,"ABC",123,23000,15000,629175);
		emp1.printDetails();
		Employee emp2 = new Employee("Ginista",22,"XYZ",124,25000,10000,629173);
		emp2.printDetails();
	}
}
