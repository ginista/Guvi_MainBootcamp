package day14.Stream;
import java.util.Arrays;

public class Stream2 {

	public static void main(String[] args) {
		//Create an array of String
		String[] array = {"Balaji","Ajith","Vijay","Suria","Vikram"};
		
		//Create a stream of an array
		java.util.stream.Stream<String> sa = Arrays.stream(array);
		//Traversing using terminal operation forEach		
		sa.forEach(System.out::println);

	}

}
