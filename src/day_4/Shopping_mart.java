package day_4;
import java.util.*;

public class Shopping_mart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Shopping mall : ");
		System.out.println("1-Milk");
		System.out.println("2-Bread");
		System.out.println("3-Egg");
		System.out.println("4-Cheese");
		System.out.println("5-Vegetable");
		double price;
		System.out.println("Enter your option (1-5): ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			price = 60;
			System.out.println("Milk is added to your cart");
			break;
		case 2:
			price =120;
			System.out.println("Bread is added to your cart");
			break;
		case 3:
			price =10;
			System.out.println("Egg is added to your cart");
			break;
		case 4: 
			price = 50;
			System.out.println("Cheese is added to your cart");
			break;
		case 5:
			price=200;
			System.out.println("Vegetable is added to your cart");
			break;
		default:
			System.out.println("Invalid option");
			return;
		}

		System.out.println("Thank you for shopping with us. Price : "+ price);
	}

}
