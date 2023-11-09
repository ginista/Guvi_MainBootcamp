package day_4;
import java.util.*;

public class Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter into shopping market : ");
		String option = scan.next();
		switch(option) {
		case "clothes":
			System.out.println("Door-1");
			break;
		case "grocery":
			System.out.println("Door-2");
			break;
		case "utensils":
			System.out.println("Door -3");
			break;
		case "furniture":
			System.out.println("Door-4");
			break;
		default:
			System.out.println("Invalid");
		}

	}

}
