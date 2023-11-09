package day_10.org.exception;

public class Exception_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s = "Antanin Ginista";
			char c = s.charAt(s.length());
			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("StringIndexOutOfBoundsException");
			//e.printStackTrace();
		}

	}

}
