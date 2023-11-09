package day_8.org.encapsulation;
//Achieve security
//For encapsulation data members should be private
public class Employee {
      //private variable to store the data
	private String name;
	private int age;
	private double salary;
	//getter method for all -> read the value
	public String getName() {
		return name;
	}
	
	//Setter method for taking the values
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		//business logic
		if(age>0) {
			this.age = age;
		}
		else {
			System.out.println("Age cannot be negative");
		}
	}
	//Setter and getter for salary
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary>0) {
			this.salary = salary;
		}
		else {
			System.out.println("Salary must be greater than 0");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an object
		Employee emp1 = new Employee();
		emp1.setName("Antanin Ginsita");
		emp1.setAge(22);
		emp1.setSalary(15000);
	   System.out.println(emp1.name+" "+emp1.age+" "+emp1.salary);
		

	}

}
