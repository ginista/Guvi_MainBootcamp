package day_10.org.exception;
//Arithmetic Exception
public class Exception_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 0;
		try {
		System.out.println(num1/num2);
		System.out.println("Hello buddy...");
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
        finally {
        	System.out.println("Finally block is always executed.");
        }
	}

}
