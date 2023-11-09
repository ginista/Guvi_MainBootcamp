package day_10.org.exception.cutomException;

public class Voter {
	//create 2 data member
	private String name;
	private int age;
	public Voter(String name, int age)throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Voter age must be greater than 18");
			
		}
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	

}
