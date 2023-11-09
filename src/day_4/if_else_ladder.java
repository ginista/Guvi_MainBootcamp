package day_4;
import java.util.*;

public class if_else_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int marks = scan.nextInt();
		if(marks<50)
			System.out.println("Failed");
		else if(marks>=50 &&marks<60)
			System.out.println("D Grade");
		else if(marks>=60 && marks<70)
			System.out.println("C Grade");
		else if(marks >=70 && marks <80)
			System.out.println("B Grade");
		else if(marks>=80 && marks<90)
			System.out.println("A Grade");
		else if(marks>=90 && marks<100)
			System.out.println("A+ Grade");
		else
			System.out.println("Invalid");

	}

}
