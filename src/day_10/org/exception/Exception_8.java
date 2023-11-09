package day_10.org.exception;

public class Exception_8 {

	public static void main(String[] args) throws ClassNotFoundException {
		// Class not found Exception
		try {
			Class.forName("class1");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
		
		

	}

}
