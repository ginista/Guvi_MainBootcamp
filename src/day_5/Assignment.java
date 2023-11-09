package day_5;
import java.util.*;

public class Assignment {

	public static void main(String[] args) {
		//A librarian uses a program to search for specific book in the library catalog. 
		//The books are stored in an array enter the book title.
		//Develop an app which should search and find out if books is available in library or not.
		
		System.out.println("Enter the number of books : ");
		boolean isAvailable = false;
		Scanner scan = new Scanner(System.in);
		int numberOfBooks = scan.nextInt();
		scan.nextLine();//Consume the newline character.
		String books[] = new String[numberOfBooks];
		System.out.println("Size of array "+books.length);
		System.out.println("Enter the name of books one by one :");
		for(int i=0;i<numberOfBooks;i++) {
			books[i] = scan.nextLine();
		}
		
		System.out.println("Enter the name of book to search : ");
		String searchBook = scan.nextLine();
		for(String book:books) {
			if(book.equals(searchBook)) {
				isAvailable = true;
				break;
			}
		}
		if(isAvailable) {
			System.out.println("Yeahh!! Book is Available");
		}
		else {
			System.out.println("Book is not Available dude!!");
		}
 scan.close();
	}

}
