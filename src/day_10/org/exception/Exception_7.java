package day_10.org.exception;

public class Exception_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Number Format Exception
		try {
			int num = Integer.parseInt("Ginista");
			System.out.println(num);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Number format Exception");
			//e.printStackTrace();
		}

	}

}
