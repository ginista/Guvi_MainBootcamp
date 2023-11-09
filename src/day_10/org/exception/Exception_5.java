package day_10.org.exception;

public class Exception_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array dynamically.
		
		try {
			int arr[] = new int[10];//Created an array of size 10
			
			arr[4] = 10;
			System.out.println(arr[10]);
			System.out.println(arr[2]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
	          System.out.println("ArrayIndexOutofBound Exception");
		}

	}

}
