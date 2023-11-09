package Day_7;

public class Test {
  // data member
	String name;//instance variable(requirement is different)
	int age;
	static String company = "Guvi";// static data member(should be applied requirement is common)
	//static block
	static {
		
		System.out.println("In a static block");
	}
	//instance block
	{
		System.out.println("In instance");
	}
	static void getCompany() {
		System.out.println("Person working in "+Test.company);//use class name for static
	}
	//constructor
	Test(){
		System.out.println("0-argument Constructor");
	}
	//define a parameterised constructor
	public Test(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("2-Argument Constructor");
	}
	//method(Logic Part)
	//static part of class(Access using class name)
	//instance part of object(using object reference)
	 void sayWelcome() {
		System.out.println("Hello,my name is " + this.name+" I am "+this.age+" years old");
	}
	 private void getSalary() {//not accessible to other class
		 
	 }
	 protected void getProjectName() {//can utilize only in same package
		 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object for class Test
		Test t1 = new Test();//Constructor must invoked
		Test t2 = new Test("Ramesh",45);
		Test t3 = new Test("Ginista",22);
		//call method using object reference ->t1, t2
		//Accessing should be done using object reference
	
		t2.sayWelcome();
		Test.getCompany();//Acess using classname for static method.
		t3.sayWelcome();
		
		

	}

}
