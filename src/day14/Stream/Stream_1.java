package day14.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_1 {

	public static void main(String[] args) {
		//Create a list of integer
		List<Integer> numbers = Arrays.asList(10,15,8,20,25);
		
		//Filter and print even numbers.
		
		//chaining or pipelining
		numbers.stream()
		        .filter(num ->num%2==0)
		        .forEach(System.out::println);
		
		//map and get a new list
		List <Integer> squares = numbers.stream()
				.map(n->n*n)
				.collect(Collectors.toList());
		System.out.println(squares);
		
		List<String> list = Arrays.asList("Pune","Chennai","Mumbai","Delhi","Kolkata");
        //From the above list, i wan to create a stream of list
		Stream<String> s1=list.stream();
		s1.forEach(System.out::println);
		
		//sum
		int sum = numbers.stream()
				.reduce(10, Integer::sum);//First parameter is initial value.
		System.out.println(sum);
		
	}
}
//lambda expression
