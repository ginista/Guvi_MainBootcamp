package day_4;
import java.util.*;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if(num1>num2) {
			System.out.printf("%d is greater than %d",num1,num2);
		}
		else {
			System.out.printf("%d is greater than %d",num2,num1);
		}

	}

}
