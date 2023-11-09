package day_10.org.exception.cutomException;

public class Main {

	public static void main(String[] args) {
		
		try {
			Voter voter1 = new Voter("Gini",22);
			System.out.println("Voter Name : "+voter1.getAge());
			System.out.println("Voter Age : "+voter1.getAge());
			
			Voter voter2 = new Voter("Gini",15);
			System.out.println("Voter Name : "+voter2.getAge());
			System.out.println("Voter Age : "+voter2.getAge());
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		
		}
		

	}

}
