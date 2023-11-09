package day_10.org.exception;

//Null Pointer Exception
public class Exception_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String a = null;
			System.out.println(a.charAt(0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Null pointer Exception. String is empty.");
			//e.printStackTrace();
		}

	}

}
